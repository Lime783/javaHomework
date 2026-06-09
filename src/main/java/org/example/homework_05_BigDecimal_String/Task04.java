package org.example.homework_05_BigDecimal_String;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task04 {

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

    public static void checkIfDiscountPercentageIsValid(BigDecimal discountPercentage) throws Exception {
        if (!(discountPercentage.compareTo(BigDecimal.ZERO) >= 0 || discountPercentage.compareTo(BigDecimal.valueOf(100)) <= 0)) {
            throw new Exception("Provide a normal discount percentage (between 0 and 100)");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        BigDecimal price, discountPercentage;

        System.out.print("Enter price: ");
        price = scanner.nextBigDecimal();
        checkIfPriceIsValid(price);

        System.out.print("Enter discount percentage: ");
        discountPercentage = scanner.nextBigDecimal();
        checkIfDiscountPercentageIsValid(discountPercentage);

        System.out.print("Price after discount is " + price
                .multiply(BigDecimal.ONE.subtract(discountPercentage.movePointLeft(2)))
                .setScale(2, RoundingMode.HALF_UP));
    }
}
