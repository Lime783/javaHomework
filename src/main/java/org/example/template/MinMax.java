package org.example.template;

import java.util.Objects;

public final class MinMax {
    private MinMax() {
    }

    public static <T extends Comparable<? super T>> Pair<T, T> minMax(T[] array) {
        Objects.requireNonNull(array, "array must not be null");
        if (array.length == 0) {
            throw new IllegalArgumentException("array must not be empty");
        }

        validateNulls(array);

        T min = array[0];
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(min) < 0) {
                min = element;
            }
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return Pair.of(min, max);
    }

    static private <T> void validateNulls(T[] array) {
        for (T element : array) {
            if (element == null) {
                throw new IllegalArgumentException("No element can be null inside array");
            }
        }
    }
}
