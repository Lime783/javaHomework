package org.example.homework_02_loops;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, product = 1;

        System.out.print("Enter a base: ");
        x = scanner.nextInt();
        System.out.print("Enter an index: ");
        y = scanner.nextInt();

        for (int i = 1; i <= y; i++) {
            product *= x;
        }

        System.out.println(x + " ^ " + y + " = " + product);
    }
}
