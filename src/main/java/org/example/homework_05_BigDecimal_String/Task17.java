package org.example.homework_05_BigDecimal_String;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task17 {

    public static void checkIfPriceIsValid(BigDecimal price) throws Exception {
        if (!(price.precision() == price
                .setScale(2, RoundingMode.HALF_UP)
                .stripTrailingZeros()
                .precision())) {
            throw new Exception("Provide a normal price (max 2 digits after the dot)");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String productName;
        BigDecimal productPrice;

        System.out.print("Enter a product name: ");
        productName = scanner.nextLine();

        System.out.print("Enter a product price: ");
        productPrice = scanner.nextBigDecimal();

        checkIfPriceIsValid(productPrice);

        System.out.print("Product: " + productName + ", price: " + productPrice.setScale(2, RoundingMode.HALF_UP) + " PLN");
    }
}
