package org.example.homework_02_loops;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Type a number: ");
        n = scanner.nextInt();
        while (n >= 0) {
            System.out.println(n);
            n--;
        }
    }
}
