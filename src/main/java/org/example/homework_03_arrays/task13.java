package org.example.homework_03_arrays;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] tabOfChar;
        String inputString;

        System.out.print("Enter a string: ");
        inputString = scanner.nextLine();
        tabOfChar = inputString.toCharArray();

        for (int i = 0; i <= (inputString.length() - 1); i++) {
            System.out.println(tabOfChar[i]);
        }
    }
}
