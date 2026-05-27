package org.example.homework_01_if;

import java.util.Scanner;

public class Task12 {

    public static boolean isLeapYear(int year) {
        return year % 4 == 0;
    }

    public static boolean isDateValid(int year, int month, int day) {

        if (year < 0){
            return false;
        }

        if (month < 1 || month > 12) {
            return false;
        }

        if  (day < 1 || day > 31) {
            return false;
        }

        return switch (month){
            case 1, 3, 5, 7, 8, 10, 12 -> true;
            case 4, 6, 9, 11 -> day <= 30;
            case 2 -> {
                if (isLeapYear(year) && day > 29) {
                    yield false;
                } else if (!(isLeapYear(year)) && day > 28) {
                    yield false;
                }
                yield true;
            }
            default -> false;
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        int month;
        int day;

        System.out.print("Type a year (YYYY): ");
        year = scanner.nextInt();
        System.out.print("Type a month (MM): ");
        month = scanner.nextInt();
        System.out.print("Type a day (DD): ");
        day = scanner.nextInt();
        System.out.print((isDateValid(year, month, day) ? "Valid date" : "Invalid date"));
    }
}
