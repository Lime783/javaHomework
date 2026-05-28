package org.example.homework_03_arrays;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] tabOfInt;
        int length;

        System.out.print("Enter the length of the array: ");
        length = scanner.nextInt();
        if (length <= 0) {
            throw new Exception("The length of the array must be greater than zero.");
        } else {
            tabOfInt = new int[length];
        }

        for (int i = 0; i < length; i++) {
            System.out.print("Enter the number to add in position " + i + ": ");
            tabOfInt[i] = scanner.nextInt();
        }

        for (int i = (tabOfInt.length - 1); i >= 0; i--) {
            System.out.print(tabOfInt[i] + " ");
        }
    }
}
