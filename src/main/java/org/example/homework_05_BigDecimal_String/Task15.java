package org.example.homework_05_BigDecimal_String;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        String[] separateWords;

        System.out.print("Enter a sentence: ");
        input = scanner.nextLine();

        separateWords = input.split(" ");
        for (String word : separateWords) {
            System.out.println(word);
        }
    }
}
