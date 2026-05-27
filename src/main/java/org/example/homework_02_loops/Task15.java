package org.example.homework_02_loops;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n;
        long sum = 1L;

        System.out.print("Enter a positive number: ");
        n = scanner.nextInt();
        if (n < 0){
            throw new Exception("Provide a positive number");
        }
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        System.out.print(n + "! = " + sum);
    }
}
