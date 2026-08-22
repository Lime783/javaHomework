package org.example.homework_16_threads.task4;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    static final int GROSZ_IN_ZL = 100;
    static final int MIN_TRANSACTION_AMOUNT = 100;
    static final int MAX_TRANSACTION_AMOUNT = 400;
    public static final int INITIAL_ACCOUNT_PLN = 1000;


    public static void main(String[] args) {
        Bank bank  = new Bank();
        Random random = new Random(42);
        ExecutorService pool = Executors.newFixedThreadPool(8);

        for (int i = 0; i < 10; i++) {
            bank.openAccount(i, INITIAL_ACCOUNT_PLN);
        }

        CompletableFuture<?>[] all = new CompletableFuture[1000];
        for (int i = 0; i < 1000; i++) {
            int from = random.nextInt(10);
            int to;
            do {
                to = random.nextInt(10);
            } while (to == from);
            long amountGrosz = (random.nextInt(MAX_TRANSACTION_AMOUNT - MIN_TRANSACTION_AMOUNT + 1) + MIN_TRANSACTION_AMOUNT) * GROSZ_IN_ZL;
            int finalTo = to; // finalne dla lambdy
            CompletableFuture<Void> transaction = CompletableFuture.runAsync(() -> {
                        try{
                            bank.transfer(from, finalTo, amountGrosz);
                        } catch(InsufficientFundsException e){
                            System.out.println(e.getMessage());
                        }
                    },
                    pool
            );
            all[i] = transaction;
        }
        CompletableFuture.allOf(all).join();
        pool.shutdown();

        System.out.println("Total balance: " + bank.totalBalanceInGrosz()/ GROSZ_IN_ZL + "zl");
    }
}
