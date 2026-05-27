package org.example.homework_01_if;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number representing the day of the week: ");
        int dayOfWeek = scanner.nextInt();
        switch (dayOfWeek) {
            case 1:
                System.out.print("Poniedziałek");
                break;
            case 2:
                System.out.print("Wtorek");
                break;
            case 3:
                System.out.print("Środa");
                break;
            case 4:
                System.out.print("Czwartek");
                break;
            case 5:
                System.out.print("Piątek");
                break;
            case 6:
                System.out.print("Sobota");
                break;
            case 7:
                System.out.print("Niedziela");
                break;
            default:
                System.out.print("Nieznany dzień");
        }
    }
}
