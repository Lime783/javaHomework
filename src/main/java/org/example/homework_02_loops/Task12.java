package org.example.homework_02_loops;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber;
        int sum = 0;

//        while (true) {
//            System.out.print("Type a number: ");
//            inputNumber = scanner.nextInt();
//            if (inputNumber == 0) {
//                break;
//            }
//            if (inputNumber > 0) {
//                sum += inputNumber;
//            }
//        }

        do {
            System.out.print("Type a number: ");
            inputNumber = scanner.nextInt();
            if (inputNumber > 0) {
                sum += inputNumber;
            }
        } while (inputNumber != 0);

        System.out.println("Sum of positive numbers is " + sum);
    }
}
