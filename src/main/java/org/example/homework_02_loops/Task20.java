package org.example.homework_02_loops;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        StringBuilder output = new StringBuilder();

        System.out.print("Type a string: ");
        input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {
            output.append(input.charAt(input.length() - 1 - i));
        }
        System.out.println(input + " backwards is " + output.toString());
    }
}
