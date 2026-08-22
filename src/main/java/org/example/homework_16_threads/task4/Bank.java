package org.example.homework_16_threads.task4;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    // Wybralem List bo tworze konta tylko na poczatku dzialania programu
    // i nie potrzebuje synchronizacji np. dodawania do listy przez rozne watki.
    List<BankAccount> accounts = new ArrayList<>();

    public void openAccount(int id, long initialPln) {
        accounts.add(new BankAccount(id, initialPln));
    }

    /** Atomowy przelew: albo obie strony, albo żadna. NIE może się zakleszczyć. */
    public void transfer(int fromId, int toId, long amountGrosz) {
        if (fromId == toId) {
            throw new IllegalArgumentException("fromId and toId can't be the same");
        }

        BankAccount fromAccount = accounts.get(fromId);
        BankAccount toAccount = accounts.get(toId);

        BankAccount first = fromId < toId ? accounts.get(fromId) : accounts.get(toId);
        BankAccount second = fromId < toId ? accounts.get(toId) : accounts.get(fromId);

        synchronized (first) {
            synchronized (second) {
                fromAccount.withdraw(amountGrosz);
                toAccount.deposit(amountGrosz);
            }
        }
    }

    /** Suma sald wszystkich kont w groszach. */
    public long totalBalanceInGrosz() {
        long totalBalance = 0;
        for (BankAccount account : accounts) {
            totalBalance += account.getBalanceInGrosz();
        }
        return totalBalance;
    }
}