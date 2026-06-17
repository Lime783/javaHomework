package org.example.homework_04_functions;

import java.util.Scanner;

public class Task02 {

    public static int multiplyInts(int int1, int int2){
        return int1 * int2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int int1, int2;

        System.out.print("Enter first number: ");
        int1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int2 = scanner.nextInt();

        System.out.print(multiplyInts(int1, int2));
    }
}
