package org.example.homework_05_BigDecimal_String;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task06 {

    public static void checkIfPriceIsValid(BigDecimal price) throws Exception {
        if (!(price.stripTrailingZeros().precision() == price
                .setScale(2, RoundingMode.HALF_UP)
                .stripTrailingZeros()
                .precision())) {
            throw new Exception("Provide a normal price (max 2 digits after the dot)");
        }
        if (price.compareTo(BigDecimal.ZERO) < 0){
            throw new Exception("Price cannot be negative");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        BigDecimal price1, price2;

        System.out.print("Enter price 1: ");
        price1 = scanner.nextBigDecimal();
        checkIfPriceIsValid(price1);

        System.out.print("Enter price 2: ");
        price2 = scanner.nextBigDecimal();
        checkIfPriceIsValid(price2);

        System.out.print(price1.compareTo(price2) > 0 ? "price 1 is bigger" : "price 2 is bigger");
    }
}
