package org.example.homework_16_threads.task3;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FactorialPool {
    private static final int POOL_SIZE = 4;
    private static final int MAX_N = 20;

    static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(100, 501));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(POOL_SIZE);
        List<Future<BigInteger>> futures = new ArrayList<>();

        for (int i = 0; i <= MAX_N; i++) {
            final int finalI = i;
            Future<BigInteger> future = pool.submit(() -> factorial(finalI));
            futures.add(future);
        }

        pool.shutdown();

        for (int i = 0; i <= MAX_N; i++) {
            try {
                System.out.println(i + "! = " + futures.get(i).get());
            } catch (ExecutionException e) {
                e.getCause();
            }
        }
    }
}
