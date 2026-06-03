package org.example;

import java.util.Scanner;

public class Task19 {

    static Scanner scanner = new Scanner(System.in);

    public static void menu(double result) {

        System.out.println("Current result is " + result);
        System.out.println("""
                
                What do you want to do with the result?
                1 - Addition
                2 - Subtraction
                3 - Multiplication
                0 - Exit""");

        switch (scanner.nextInt()) {
            case 1 -> {
                result = addition(result);
                menu(result);
            }
            case 2 -> {
                result = subtraction(result);
                menu(result);
            }
            case 3 -> {
                result = multiplication(result);
                menu(result);
            }
            case 0 -> {
                System.out.print("The result is " + result);
            }
            default -> {
                System.out.println("Invalid input");
            }
        }
    }

    private static double addition(double result) {
        System.out.print("Provide a number to add: ");
        double number = scanner.nextDouble();
        return result + number;
    }

    private static double subtraction(double result) {
        System.out.print("Provide a number to subtract: ");
        double number = scanner.nextDouble();
        return result - number;
    }

    private static double multiplication(double result) {
        System.out.print("Provide a number to multiply: ");
        double number = scanner.nextDouble();
        return result * number;
    }

    public static void main(String[] args) {
        double result = 0.0;

        menu(result);
    }
}
