package org.example.homework_01_if;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        System.out.print("Type an age: ");
        age = scanner.nextInt();
        System.out.println((age < 18 ? "Not an adult" : "Adult"));
    }
}
