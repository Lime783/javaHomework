package org.example;

import java.util.Scanner;

public class Task04 {

    public static boolean isIntEven(int intNumber){
        return intNumber % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        System.out.print(isIntEven(number) ? "Yes" : "No");
    }
}
