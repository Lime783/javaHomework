package org.example.homework_02_loops;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n;

        do {
            System.out.print("Enter a number: ");
            n = scanner.nextDouble();
        } while (n < 0);
    }
}
