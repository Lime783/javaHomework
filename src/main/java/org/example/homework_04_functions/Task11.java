package org.example.homework_04_functions;

public class Task11 {

    public static int findMaxIntInArray(int[] array) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arrayOfInts1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arrayOfInts2 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arrayOfInts3 = {1, 2, 3, 4, 5, 6, 7};
        int[] arrayOfInts4 = {1, 2, 3, 4, 5, 6};

        System.out.println(findMaxIntInArray(arrayOfInts1));
        System.out.println(findMaxIntInArray(arrayOfInts2));
        System.out.println(findMaxIntInArray(arrayOfInts3));
        System.out.println(findMaxIntInArray(arrayOfInts4));
    }
}
