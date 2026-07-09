package org.example.template;

import java.util.Objects;

public final class ArrayUtils {
    private ArrayUtils() {
    }

    public static <T> void swap(T[] arr, int i, int j) {
        Objects.requireNonNull(arr, "array is null");
        if (i < 0 || i >= arr.length || j < 0 || j >= arr.length) {
            throw new IndexOutOfBoundsException("index out of bounds");
        }
        T temporary = arr[i];
        arr[i] = arr[j];
        arr[j] = temporary;
    }
}
