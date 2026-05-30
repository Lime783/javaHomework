package org.example.homework_03_arrays;

import java.util.Scanner;

public class task10 {

    static Scanner scanner = new Scanner(System.in);

    public static int[] generateArray() throws Exception {
        int length;
        int[] tabOfInt;

        System.out.print("Enter the length of the array: ");
        length = scanner.nextInt();
        if (length <= 0) {
            throw new Exception("The length of the array must be greater than zero.");
        } else {
            tabOfInt = new int[length];
        }
        return tabOfInt;
    }

    public static void fillArray(int[] tabOfInt) {
        for (int i = 0; i < tabOfInt.length; i++) {
            System.out.print("Enter the number to add in position " + i + ": ");
            tabOfInt[i] = scanner.nextInt();
        }
    }

    public static void main(String[] args) throws Exception {
        int[] tabOfInt =  generateArray();

        fillArray(tabOfInt);

        for (int i = (tabOfInt.length - 1); i >= 0; i--) {
            System.out.print(tabOfInt[i] + " ");
        }
    }
}
