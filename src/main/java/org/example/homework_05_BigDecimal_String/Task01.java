package org.example.homework_05_BigDecimal_String;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task01 {
    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal("10.50");
        BigDecimal bigDecimal2 = new BigDecimal("2.25");

        System.out.println(bigDecimal1.add(bigDecimal2));
        System.out.println(bigDecimal1.subtract(bigDecimal2));
        System.out.println(bigDecimal1.multiply(bigDecimal2));
        System.out.println(bigDecimal1.divide(bigDecimal2, 2, RoundingMode.HALF_UP));

    }
}
