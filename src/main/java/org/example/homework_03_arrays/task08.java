package org.example.homework_03_arrays;

import java.util.Scanner;

public class task08 {

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
        Scanner scanner = new Scanner(System.in);
        int x, occurences = 0;
        int[] tabOfInt = generateArray();

        fillArray(tabOfInt);

        System.out.print("What number do you want to count occurrences of? ");
        x = scanner.nextInt();

        for (int i = 0; i < tabOfInt.length; i++) {
            if (tabOfInt[i] == x) {
                occurences++;
            }
        }

        System.out.print("The number " + x + " appears " + occurences + " times");
    }
}
