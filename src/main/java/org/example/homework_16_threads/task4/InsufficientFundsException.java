package org.example.homework_16_threads.task4;

/**
 * Nieoznaczony (unchecked) – nie zmusza do try/catch w każdej lambdzie.
 */
public class InsufficientFundsException extends RuntimeException {

    public static final int GROSZ_IN_ZL = 100;

    public InsufficientFundsException(int accountId, long balanceGrosz, long requestedGrosz) {
        super(accountId + " currently has " + balanceGrosz / GROSZ_IN_ZL + "zl, cannot withdraw " + requestedGrosz / GROSZ_IN_ZL + "zl");
    }
}
