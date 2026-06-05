package org.example.homework_05_BigDecimal_String;

import java.math.BigDecimal;

public class Task10 {
    public static void main(String[] args) {
        System.out.println(0.1 + 0.2);
        System.out.println(BigDecimal.valueOf(0.1).add(BigDecimal.valueOf(0.2)));
        System.out.println((BigDecimal.valueOf(0.1).add(BigDecimal.valueOf(0.2))).compareTo(new BigDecimal(0.1).add(new BigDecimal(0.2))));
    }
}
