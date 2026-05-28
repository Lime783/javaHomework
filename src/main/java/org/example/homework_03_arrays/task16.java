package org.example.homework_03_arrays;

public class task16 {
    public static void main(String[] args) {
        double[][] tabOfInt = {{1, 2, 3},
                                {4, 5, 6},
                                {7, 8, 9}};
        double sumOfRow = 0;

        for (int i = 0; i < tabOfInt.length; i++) {
            for (int j = 0; j < tabOfInt[i].length; j++) {
                sumOfRow += tabOfInt[i][j];
            }
            System.out.println("The sum of row " + i + " is " + sumOfRow);
            sumOfRow = 0;
        }
    }
}
