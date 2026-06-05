package org.example.homework_05_BigDecimal_String;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputSentence;

        System.out.print("Enter the sentence: ");
        inputSentence = scanner.nextLine();

        System.out.println("Sentence with _ instead of \" \" :" + inputSentence.replace(" ", "_"));
        System.out.println("Sentence without \",\" :" + inputSentence.replace(",", ""));
    }
}
