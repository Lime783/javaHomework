package org.example.homework_01_if;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You are an adult");
        }
        else {
            System.out.println("You are not an adult");
        }
    }
}
