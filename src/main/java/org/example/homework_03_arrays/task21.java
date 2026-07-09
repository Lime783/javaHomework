package org.example.homework_03_arrays;

import java.util.Scanner;

public class task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine().replaceAll(" ","").toUpperCase();
        String reverseString = new StringBuilder(inputString).reverse().toString();

        System.out.print(inputString.equals(reverseString) ? "It is a palindrome" : "It is not a palindrome");
    }
}
