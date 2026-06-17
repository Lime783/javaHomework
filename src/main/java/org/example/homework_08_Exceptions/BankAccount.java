package org.example.homework_08_Exceptions;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class BankAccount {
    private BigDecimal balance;

    public BankAccount(BigDecimal balance) {
        if (Objects.isNull(balance)) {
            throw new IllegalArgumentException("Initial balance cannot be null");
        }
        if (balance.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative: " + balance);
        }
        if (!(checkIfAmountHasGoodPrecision(balance))) {
            throw new IllegalArgumentException("Initial balance must not have more than two digits after the dot: " + balance);
        }
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    private boolean checkIfAmountHasGoodPrecision(BigDecimal amount) {
        return Objects.equals(amount.stripTrailingZeros().precision(),
                amount.setScale(2, RoundingMode.HALF_UP)
                        .stripTrailingZeros()
                        .precision());
    }

    public void withdrawMoney(BigDecimal amount) throws InsufficientFundsException {
        if (Objects.isNull(amount)) {
            throw new IllegalArgumentException("Amount cannot be null");
        }
        if (amount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Amount to withdraw is negative: " + amount);
        }
        if (amount.compareTo(getBalance()) > 0) {
            throw new InsufficientFundsException("Insufficient funds (" + getBalance() + ") for withdrawal of: " + amount + " units");
        }
        if (!(checkIfAmountHasGoodPrecision(amount))) {
            throw new IllegalArgumentException("Amount to withdraw must not have more than two digits different than 0 after the dot: " + amount);
        }
        balance = balance.subtract(amount);
    }
}
