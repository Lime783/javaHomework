package org.example.homework_05_BigDecimal_String;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task05 {

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
        BigDecimal price;

        System.out.print("Enter price: ");
        price = scanner.nextBigDecimal();

        checkIfPriceIsValid(price);

        System.out.print("Price after tax is " + (price.add(price.multiply(BigDecimal.valueOf(0.23)))));
    }
}
