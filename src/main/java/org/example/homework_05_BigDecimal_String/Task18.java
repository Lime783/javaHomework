package org.example.homework_05_BigDecimal_String;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task18 {

    public static void checkIfAmountIsValid(int amount) throws Exception {
        if (amount < 0) {
            throw new Exception("Amount cannot be negative");
        }
        if (amount == 0) {
            throw new Exception("Amount cannot be zero");
        }
    }

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
        int amountOfProducts;
        BigDecimal currentPrice;
        BigDecimal[] productPrices;

        System.out.print("Enter amount of products: ");
        amountOfProducts = scanner.nextInt();
        checkIfAmountIsValid(amountOfProducts);
        productPrices = new BigDecimal[amountOfProducts];

        for (int i = 0; i < amountOfProducts; i++) {
            System.out.print("Enter a price of product " + (i + 1) + ": ");
            currentPrice = scanner.nextBigDecimal();
            checkIfPriceIsValid(currentPrice);
            productPrices[i] = currentPrice;
        }

        for (BigDecimal productPrice : productPrices) {
            System.out.println(productPrice.setScale(2, RoundingMode.HALF_UP) + " zł");
        }
    }
}
