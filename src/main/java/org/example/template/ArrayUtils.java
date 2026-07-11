package org.example.template;

import java.util.Objects;

public final class ArrayUtils {
    private ArrayUtils() {
    }

    public static <T> void swap(T[] array, int i, int j) {
        Objects.requireNonNull(array, "array is null");
        if (i < 0 || i >= array.length || j < 0 || j >= array.length) {
            throw new IndexOutOfBoundsException("index out of bounds");
        }
        T temporary = array[i];
        array[i] = array[j];
        array[j] = temporary;
    }

    public static <T> int indexOf(T[] array, T value) {
        Objects.requireNonNull(array, "array cannot be null");
        for (int i = 0; i < array.length; i++) {
            if (Objects.equals(array[i], value)) {
                return i;
            }
        }
        return -1;
    }

    public static <T> int lastIndexOf(T[] array, T value) {
        Objects.requireNonNull(array, "array cannot be null");
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (Objects.equals(array[i], value)) {
                index = i;
            }
        }
        return index;
    }

    public static <T> boolean arraysEqual(T[] array1, T[] array2) {
        if (Objects.isNull(array1) && Objects.isNull(array2)) {
            return true;
        }

        if (Objects.isNull(array1) || (Objects.isNull(array2))) {
            return false;
        }

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!(Objects.equals(array1[i], array2[i]))) {
                return false;
            }
        }

        return true;
    }
}
