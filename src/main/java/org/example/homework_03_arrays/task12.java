package org.example.homework_03_arrays;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] tabOfInt1, tabOfInt2, tabOfsum;
        int length;

        System.out.print("Enter the length of two arrays: ");
        length = scanner.nextInt();
        if (length <= 0) {
            throw new Exception("The length of the array must be greater than zero.");
        } else {
            tabOfInt1 = new int[length];
            tabOfInt2 = new int[length];
            tabOfsum = new int[length];
        }

        for (int i = 0; i < length; i++) {
            System.out.print("Enter the number to add in position " + i + " in array 1: ");
            tabOfInt1[i] = scanner.nextInt();
        }

        for (int i = 0; i < length; i++) {
            System.out.print("Enter the number to add in position " + i + " in array 2: ");
            tabOfInt2[i] = scanner.nextInt();
        }

        for (int i = 0; i < length; i++) {
            tabOfsum[i] = tabOfInt1[i] + tabOfInt2[i];
            System.out.print(tabOfsum[i] + " ");
        }
    }
}
