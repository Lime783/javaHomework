package org.example.homework_16_threads.task2;

import java.util.Objects;
import java.util.Random;

public class ParallelSum {
    private static final int SIZE = 1_000_000;
    private static final int PARTS = 4;
    private static final Random random = new Random();

    static class PartialSumTask implements Runnable {
        private final int[] data;
        private final int from;             // włącznie
        private final int to;               // wyłącznie
        private final long[] results;       // WSPÓLNA tablica wyników
        private final int index;            // MÓJ i tylko mój indeks w results

        PartialSumTask(int[] data, long[] results, int index) {
            this.data = Objects.requireNonNull(data, "data is null");
            this.results = Objects.requireNonNull(results, "results is null");
            this.index = index;

            this.from = SIZE / PARTS * index;
            this.to = SIZE / PARTS * (index + 1) - 1;
        }

        @Override
        public void run() {
            System.out.println("Thread number: " + index + " started counting from: " + from + " to: " + to);
            long currentSum = 0;
            for (int i = from; i <= to; i++) {
                currentSum += data[i];
            }
            results[index] = currentSum;
        }
    }

    static long sequentialSum(int[] data) {
        long sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum;
    }

    public static void main(String[] args) throws InterruptedException {
        if (SIZE % PARTS != 0) {
            throw new IllegalArgumentException("Provide another size (" + SIZE + ")" +
                    " or parts count (" + PARTS + ") to make them divisible by each other");
        }

        Thread[] threads = new Thread[PARTS];
        long[] results = new long[PARTS];
        int[] data = new int[SIZE];
        long resultSum = 0;

        for (int i = 0; i < SIZE; i++) {
            data[i] = random.nextInt(0, 100);
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new PartialSumTask(data, results, i), "Sumator " + i);
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].join();
        }

        for (int i = 0; i < results.length; i++) {
            resultSum += results[i];
        }

        System.out.println("Sequential: " + sequentialSum(data));
        System.out.println("Parallel:   " + resultSum);
    }
}