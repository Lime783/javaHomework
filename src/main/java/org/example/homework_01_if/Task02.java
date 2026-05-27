package org.example.homework_01_if;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        System.out.println((number % 2 == 0 ? "even" : "odd"));
    }
}
