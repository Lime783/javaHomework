package org.example.homework_05_BigDecimal_String;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1, input2;

        System.out.print("Enter 1st string: ");
        input1 = scanner.nextLine();
        System.out.print("Enter 2nd string: ");
        input2 = scanner.nextLine();

        System.out.println(input1.equals(input2));
        System.out.println(input1.equalsIgnoreCase(input2));
    }
}
