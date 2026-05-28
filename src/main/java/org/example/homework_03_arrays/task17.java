package org.example.homework_03_arrays;

public class task17 {
    public static void main(String[] args) {
        double[][] tabOfInt = {{1, 2, 3},
                                {4, 5, 6},
                                {7, 8, 9}};
        double sumOfColumn = 0;

        for (int i = 0; i < tabOfInt.length; i++) {
            for (int j = 0; j < tabOfInt[i].length; j++) {
                sumOfColumn += tabOfInt[j][i];
            }
            System.out.println("The sum of column " + i + " is " + sumOfColumn);
            sumOfColumn = 0;
        }
    }
}