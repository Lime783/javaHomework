package org.example.homework_02_loops;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String guess;
        final String password = "Lime783";

        do {
            System.out.print("Guess a password: ");
            guess = scanner.next();
        } while (!guess.equals(password));

        System.out.print("Logged in");
    }
}
