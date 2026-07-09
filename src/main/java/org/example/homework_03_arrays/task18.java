package org.example.homework_03_arrays;

import java.util.Scanner;
import java.util.TreeSet;

public class task18 {

    static Scanner scanner = new Scanner(System.in);

    public static double[][] generateCustomMatrix() {
        int row, column;
        double[][] matrix;

        System.out.print("Enter the number of rows: ");
        row = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        column = scanner.nextInt();
        matrix = new double[row][column];

        return matrix;
    }

    public static void fillMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter a number on position " + i + ", " + j + ": ");
                matrix[i][j] = scanner.nextDouble();
            }
        }
    }

    public static TreeSet<Double> getDistinctValues(double[][] matrix) throws Exception {
        TreeSet<Double> distinctValues = new TreeSet<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                distinctValues.add(matrix[i][j]);
            }
        }

        if (distinctValues.size() < 3) {
            throw new Exception("Too little distinct values, provide at least 3");
        }

        return distinctValues;
    }

    public static double provideThirdMaxNumber(TreeSet<Double> set) {
        for (int i = 0; i < 2; i++) {
            set.removeLast();
        }
        return set.last();
    }

    public static int[][] provideCoordinatesOfValues(double[][] matrix, double max, double thirdMax) {
        int rowMax = -1, columnMax = -1, rowThirdMax = -1, columnThirdMax = -1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == max) {
                    rowMax = i;
                    columnMax = j;
                }
                if (matrix[i][j] == thirdMax) {
                    rowThirdMax = i;
                    columnThirdMax = j;
                }
            }
        }

        return new int[][]{{rowMax, columnMax},
                            {rowThirdMax, columnThirdMax}};
    }

    public static void main(String[] args) throws Exception {
        double max, thirdMax;
        double[][] tabOfDouble = generateCustomMatrix();
        TreeSet<Double> setOfdoubles;
        int[][] coordinatesOfMaxValues;

        fillMatrix(tabOfDouble);

        setOfdoubles = getDistinctValues(tabOfDouble);

        max = setOfdoubles.last();
        thirdMax = provideThirdMaxNumber(setOfdoubles);

        coordinatesOfMaxValues = provideCoordinatesOfValues(tabOfDouble, max, thirdMax);

        System.out.println("Max number is " + max + " at " + coordinatesOfMaxValues[0][0] + ", " + coordinatesOfMaxValues[0][1]);
        System.out.print("Third max number is " + thirdMax + " at " + coordinatesOfMaxValues[1][0] + ", " + coordinatesOfMaxValues[1][1]);
    }
}
