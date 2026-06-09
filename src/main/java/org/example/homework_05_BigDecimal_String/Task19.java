package org.example.homework_05_BigDecimal_String;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Task19 {

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

    public static void checkIfAmountIsValid(int amount) throws Exception {
        if (amount < 0) {
            throw new Exception("Amount cannot be negative");
        }
        if (amount == 0) {
            throw new Exception("Amount cannot be zero");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        BigDecimal billAmount;
        int numberOfPeople;

        System.out.print("Enter a total bill amount: ");
        billAmount = scanner.nextBigDecimal();
        checkIfPriceIsValid(billAmount);

        System.out.print("Enter a number of people: ");
        numberOfPeople = scanner.nextInt();
        checkIfAmountIsValid(numberOfPeople);

        System.out.print("Each one of you will pay " + billAmount.divide(BigDecimal.valueOf(numberOfPeople), 2, RoundingMode.HALF_UP));
    }
}
