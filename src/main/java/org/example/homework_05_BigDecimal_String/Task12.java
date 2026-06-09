package org.example.homework_05_BigDecimal_String;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputSentence, inputWord;

        System.out.print("Enter the sentence: ");
        inputSentence = scanner.nextLine();

        System.out.print("Enter the word to check occurence of: ");
        inputWord = scanner.nextLine();

        if (inputSentence.contains(inputWord)) {
            System.out.print(inputWord + " occurs at position " + (inputSentence.indexOf(inputWord) + 1) + " to " + (inputSentence.indexOf(inputWord) + inputWord.length()));
        } else {
            System.out.print(inputWord + " does not occur in sentence");
        }
    }
}
