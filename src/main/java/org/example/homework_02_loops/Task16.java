package org.example.homework_02_loops;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int inputNumber, howManyDigits = 0;

        System.out.print("Type a positive number: ");
        inputNumber = scanner.nextInt();

        if (inputNumber < 0) {
            throw new Exception("Type a positive number");
        }

        while (inputNumber > 0) {
            howManyDigits++;
            inputNumber /= 10;
        }

        System.out.print("There are " + howManyDigits + " digits");
    }
}
