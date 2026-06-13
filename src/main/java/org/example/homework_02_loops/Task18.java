package org.example.homework_02_loops;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputNumber, max = Double.MIN_VALUE;

        do {
            System.out.print("Type a number: ");
            inputNumber = scanner.nextDouble();
            if (inputNumber > max) {
                max = inputNumber;
            }
        } while (inputNumber != 0.0);
        System.out.print("The maximum number is: " + max);
    }
}
