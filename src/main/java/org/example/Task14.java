package org.example;

import java.util.Arrays;

public class Task14 {

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            result[i + array1.length] = array2[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = {0, 0, 0};
        System.out.println(Arrays.toString(mergeArrays(array1, array2)));
    }
}
