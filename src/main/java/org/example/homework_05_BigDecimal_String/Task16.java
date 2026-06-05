package org.example.homework_05_BigDecimal_String;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.print("Enter a string: ");
        input = scanner.nextLine();

        System.out.println(input.startsWith("Java") ? "Starts with Java" : "Doesn't start with Java");
        System.out.println(input.endsWith("2025") ? "Ends with 2025" : "Doesn't end with 2025");
    }
}
