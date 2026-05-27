package org.example.homework_01_if;

import java.util.Scanner;

public class Task10 {

    public static boolean isFirstLetterCapitalized(String password) {
        return password.substring(0,1).equals(password.substring(0,1).toUpperCase());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        System.out.print("Type a password: ");
        password = scanner.nextLine();
        if (password.length() <= 7) {
            System.out.print("Password is too short");
        }
        else if (!(isFirstLetterCapitalized(password))) {
            System.out.print("Password must start with a capital letter");
        }
        else {
            System.out.print("OK");
        }
    }
}
