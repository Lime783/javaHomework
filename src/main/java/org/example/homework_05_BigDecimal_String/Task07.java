package org.example.homework_05_BigDecimal_String;

import java.math.BigDecimal;

public class Task07 {
    public static void main(String[] args) {
        BigDecimal[] productPrices = {BigDecimal.valueOf(12.34), BigDecimal.valueOf(1.34), BigDecimal.valueOf(0)};
        BigDecimal sum = BigDecimal.ZERO;

        for (BigDecimal productPrice : productPrices) {
            sum = sum.add(productPrice);
        }

        System.out.print(sum);
    }
}
