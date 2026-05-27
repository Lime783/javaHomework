package org.example.homework_02_loops;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;

        System.out.print("Type a word: ");
        word = scanner.nextLine();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a'){
                System.out.print("Found \"a\" at " + ++i + " position");
                break;
            }
            if (i == word.length() - 1) {
                System.out.print("Letter \"a\" not found");
            }
        }
    }
}
