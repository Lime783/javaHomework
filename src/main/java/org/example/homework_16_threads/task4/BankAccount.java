package org.example.homework_16_threads.task4;


public class BankAccount {
    static final int GROSZ_IN_ZL = 100;

    private final int accountId;
    private long balanceInGrosz;                 // saldo w GROSZACH

    public BankAccount(int id, long initialPln) {
        this.accountId = id;
        this.balanceInGrosz = initialPln * GROSZ_IN_ZL;
    }

    public synchronized void deposit(long amountToDepositInGrosz) {
        if (amountToDepositInGrosz <= 0) {
            throw new IllegalArgumentException("Amount to deposit must be greater than zero");
        }
        balanceInGrosz += amountToDepositInGrosz;
    }

    public synchronized void withdraw(long amountToWithdrawInGrosz) {
        if (amountToWithdrawInGrosz <= 0) {
            throw new IllegalArgumentException("Amount to withdraw must be greater than zero");
        }

        if (amountToWithdrawInGrosz > balanceInGrosz) {
            throw new InsufficientFundsException(getAccountId(), getBalanceInGrosz(), amountToWithdrawInGrosz);
        }
        balanceInGrosz -= amountToWithdrawInGrosz;
    }

    public synchronized long getBalanceInGrosz() {
        return balanceInGrosz;
    }

    public int getAccountId() {
        return accountId;                          // pole final – synchronizacja niepotrzebna
    }
}
