package org.example.homework_01_if;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        System.out.print("Enter an age: ");
        age =  scanner.nextInt();
        if (age < 12) {
            System.out.println("Child");
        } else if (age >= 12 && age <= 17) {
            System.out.println("Teen");
        } else if (age >= 18 && age <= 64) {
            System.out.println("Adult");
        } else System.out.println("Senior");
    }
}
