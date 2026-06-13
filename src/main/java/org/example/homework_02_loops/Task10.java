package org.example.homework_02_loops;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Type a number: ");
        n = scanner.nextInt();
        for (int i = n + 1; i <= n + 7; i++) {
            if (i % 7 == 0) {
                System.out.print("First number bigger than " + n + " and divisible by 7 is " + i);
                break;
            }
        }
    }
}
