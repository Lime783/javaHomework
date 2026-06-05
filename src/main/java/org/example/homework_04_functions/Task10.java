package org.example.homework_04_functions;

public class Task10 {

    public static int sumOfIntsInArray(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arrayOfInts = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(sumOfIntsInArray(arrayOfInts));
    }
}
