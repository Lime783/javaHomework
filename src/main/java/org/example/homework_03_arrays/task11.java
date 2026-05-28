package org.example.homework_03_arrays;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] tabOfInt;
        int length, bufor;

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

        bufor = tabOfInt[tabOfInt.length - 1];
        tabOfInt[tabOfInt.length - 1] = tabOfInt[0];
        tabOfInt[0] = bufor;

        for (int i = 0; i < tabOfInt.length; i++) {
            System.out.print(tabOfInt[i] + " ");
        }
    }
}
