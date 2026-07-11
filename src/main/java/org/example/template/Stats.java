package org.example.template;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public final class Stats<T extends Number> {
    private final T[] data;

    public Stats(T[] data) {
        Objects.requireNonNull(data, "array must not be null");
        if (data.length == 0) {
            throw new IllegalArgumentException("array must not be empty");
        }
        this.data = data;
    }

    public BigDecimal mean() {
        BigDecimal sum = BigDecimal.ZERO;
        for (T number : data) {
            sum = sum.add(new BigDecimal(number.toString()));
        }
        return sum.divide(new BigDecimal(data.length), 2, RoundingMode.HALF_UP);
    }

    public BigDecimal variance() {
        BigDecimal sum = BigDecimal.ZERO;
        for (T number : data) {
            sum = sum.add((new BigDecimal(number.toString())).subtract(mean()).pow(2));
        }
        return sum.divide(new BigDecimal(data.length), 2, RoundingMode.HALF_UP);    }

    public boolean hasSameMean(Stats<?> other, double eps) {
        /* |m1-m2| <= eps */

        return mean().subtract(other.mean()).abs().compareTo(new BigDecimal(eps)) <= 0;
    }
}
