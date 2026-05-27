package org.example.homework_01_if;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a temperature in Celcius: ");
        double temperatureC = scanner.nextDouble();
        if (temperatureC < 0.0) {
            System.out.println("Cold");
        } else if (temperatureC >= 0.0 && temperatureC <= 15.0) {
            System.out.println("Chill");
        } else if (temperatureC > 15.0 && temperatureC <= 25.0) {
            System.out.println("Warm");
        } else System.out.println("Hot");
    }
}
