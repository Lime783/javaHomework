package org.example.homework_03_arrays;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int[] tabOfInt;

        System.out.print("Enter a number: ");
        n = scanner.nextInt();
        tabOfInt = new int[n];
        for (int i = 0; i < tabOfInt.length; i++) {
            tabOfInt[i] = (i + 1);
            System.out.print(tabOfInt[i] + " ");
        }
    }
}
