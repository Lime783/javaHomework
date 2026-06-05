package org.example.homework_05_BigDecimal_String;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task09 {

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
        BigDecimal pricePLN, conversionRateToEUR;

        System.out.print("Enter a price in PLN: ");
        pricePLN = scanner.nextBigDecimal();
        checkIfPriceIsValid(pricePLN);

        System.out.print("Enter a conversion rate: ");
        conversionRateToEUR = scanner.nextBigDecimal();

        System.out.print("In your imaginary world you would have " + pricePLN.multiply(conversionRateToEUR).setScale(2, RoundingMode.HALF_UP) + " Euros \uD83E\uDD11");
    }
}
