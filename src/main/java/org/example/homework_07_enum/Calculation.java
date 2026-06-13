package org.example.homework_07_enum;

import java.math.BigDecimal;
import java.math.RoundingMode;

enum Calculation {
    ADD {
        @Override
        public BigDecimal calculate(BigDecimal number1, BigDecimal number2) {
            return number1.add(number2);
        }
    },
    SUBTRACT {
        @Override
        public BigDecimal calculate(BigDecimal number1, BigDecimal number2) {
            return number1.subtract(number2);
        }
    },
    MULTIPLY {
        @Override
        public BigDecimal calculate(BigDecimal number1, BigDecimal number2) {
            return number1.multiply(number2);
        }
    },
    DIVIDE {
        @Override
        public BigDecimal calculate(BigDecimal number1, BigDecimal number2) throws Exception {
            if (number2.equals(BigDecimal.ZERO)) {
                throw new Exception("Cannot divide by zero");
            }
            return number1.divide(number2, 5, RoundingMode.HALF_UP);
        }
    };

    public abstract BigDecimal calculate(BigDecimal number1, BigDecimal number2) throws Exception;
}
