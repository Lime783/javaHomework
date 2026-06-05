package org.example.homework_05_BigDecimal_String;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task03 {
    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal("10.56789");
        System.out.print(bigDecimal1.setScale(2, RoundingMode.HALF_UP));
    }
}
