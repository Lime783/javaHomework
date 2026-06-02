package org.example;

import java.util.Arrays;

public class Task13 {

    public static int[] reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - i - 1];
        }
        return reversedArray;
    }

    public static void main(String[] args) {
        int[] arrayOfInts = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arrayOfInts));
        int[] reversedArray = reverseArray(arrayOfInts);
        System.out.println(Arrays.toString(reversedArray));
    }
}
