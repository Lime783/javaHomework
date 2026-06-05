package org.example.homework_05_BigDecimal_String;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal price;

        System.out.print("Enter a price: ");
        price = scanner.nextBigDecimal();

        System.out.print(price.setScale(2, RoundingMode.CEILING));
    }
}
