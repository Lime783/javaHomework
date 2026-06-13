package org.example.homework_02_loops;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start, end;

        System.out.print("Type a starting number: ");
        start = scanner.nextInt();
        System.out.print("Type an ending number: ");
        end = scanner.nextInt();
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
