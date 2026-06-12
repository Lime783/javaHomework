package org.example.template;

import java.math.BigDecimal;
import java.math.RoundingMode;

public enum Operation {
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE;

    BigDecimal calculate(BigDecimal number1, BigDecimal number2) throws Exception {
        return switch (this.name()) {
            case "ADD" -> number1.add(number2);
            case "SUBTRACT" -> number1.subtract(number2);
            case "MULTIPLY" -> number1.multiply(number2);
            case "DIVIDE" -> number1.divide(number2, 2, RoundingMode.HALF_UP);
            default -> throw new Exception("Unknown Operation");
        };
    }
}
