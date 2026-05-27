package org.example.homework_02_loops;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        double average = 0.0;

        System.out.print("Type the number of grades: ");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Type the grade: ");
            average += scanner.nextDouble() / n;
        }
        System.out.print("The average grade is " + average);
    }
}
