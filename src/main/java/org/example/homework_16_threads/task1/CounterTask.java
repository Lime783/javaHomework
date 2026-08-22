package org.example.homework_16_threads.task1;

import java.util.Scanner;

public class CounterTask implements Runnable {
    private final int number;              // numer TEGO wątku – przekazany w konstruktorze

    public CounterTask(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Thread number: " + number + " started");
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread number: " + number + " -> current iteration: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int numberOfThreads;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of threads: ");
        numberOfThreads = scanner.nextInt(); // zakladam rozsadny input

        Thread[] threads = new Thread[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {
            threads[i] = new Thread(new CounterTask(i),  "Counter task " + i);
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("End of program");
    }
}
