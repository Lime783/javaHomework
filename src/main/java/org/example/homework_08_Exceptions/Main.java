package org.example.homework_08_Exceptions;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Task 01
        PasswordValidator.validate("an2cja1c");

        // Task 02
        NumberParser.parsePositiveInt("123");

        // Task 03
        BankAccount bankAccount = new BankAccount(new BigDecimal("123.72"));
        BigDecimal amountToWithdraw = new BigDecimal("0.00");

        try {
            bankAccount.withdrawMoney(amountToWithdraw);
        } catch (InsufficientFundsException e) {
            System.out.println(e);
        } finally {
            System.out.println("Transaction ended");
        }

        // Task 04
        CommandProcessor.demo();

        // Task 05
        EmailValidator.validate("abc@def.ghj");
    }
}
