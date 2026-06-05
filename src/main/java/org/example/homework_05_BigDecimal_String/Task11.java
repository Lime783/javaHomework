package org.example.homework_05_BigDecimal_String;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.print("Enter a string to modify: ");
        input = scanner.nextLine();

        System.out.println("Length: " + input.length());
        System.out.println(input.toLowerCase());
        System.out.println(input.toUpperCase());
        System.out.println(new StringBuilder(input).reverse());
    }
}
