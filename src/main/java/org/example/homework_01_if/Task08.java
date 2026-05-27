package org.example.homework_01_if;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfProduct;
        String message;

        System.out.print("Type a type of product: ");
        typeOfProduct =  scanner.nextLine();
        message = switch (typeOfProduct) {
            case "food", "clothes" -> "5%";
            case "electronics", "books", "other" -> "8%";
            default -> "23%";
        };
        System.out.print("Vat is " + message);
    }
}