package org.example.homework_01_if;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayOfWeek;

        System.out.print("Enter a number representing the day of the week: ");
        dayOfWeek = scanner.nextInt();
        switch (dayOfWeek) {
            case 1 -> System.out.println("Poniedziałek");
            case 2 -> System.out.println("Wtorek");
            case 3 -> System.out.println("Środa");
            case 4 -> System.out.println("Czwartek");
            case 5 -> System.out.println("Piątek");
            case 6 -> System.out.println("Sobota");
            case 7 -> System.out.println("Niedziela");
            default -> System.out.println("Nieznany dzień");
        }
    }
}