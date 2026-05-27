package org.example.homework_01_if;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String message = number %2 == 0 ? "even" : "odd";
        System.out.println(message);
    }
}
