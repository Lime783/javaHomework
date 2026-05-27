package org.example.homework_01_if;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.print("Type a year: ");
        year = scanner.nextInt();
        System.out.println((year % 4 == 0 ? "Leap year" : "Not a leap year"));
    }
}
