package org.example.homework_03_arrays;

import java.util.Scanner;

public class task09 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] tabOfInt;
        int length, x;
        boolean found = false;

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

        System.out.print("What number do you want to check occurrence of? ");
        x = scanner.nextInt();

        for (int i = 0; i < tabOfInt.length; i++) {
            if (tabOfInt[i] == x) {
                found = true;
                break;
            }
        }
        System.out.print(found ? "Found " + x : "Didn't find " + x);
    }
}
