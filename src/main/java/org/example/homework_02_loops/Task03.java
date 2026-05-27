package org.example.homework_02_loops;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;

        System.out.print("Type a number: ");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum from 1 to " + n + " is " + sum);
    }
}
