package org.example.homework_03_arrays;

import java.util.Scanner;

public class task20 {

    static double bufor;
    static Scanner scanner = new Scanner(System.in);

    public static void fillMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Enter a number on position " + i + ", " + j + ": ");
                matrix[i][j] = scanner.nextDouble();
            }
        }
    }

    public static void swapRows(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            bufor = matrix[0][i];
            matrix[0][i] = matrix[matrix.length - 1][i];
            matrix[matrix.length - 1][i] = bufor;
        }
    }

    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void swapDiagonals(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            bufor = matrix[i][i];
            matrix[i][i] = matrix[i][matrix.length - 1 - i];
            matrix[i][matrix.length - 1 - i] = bufor;
        }
    }

    public static void main(String[] args) {
        double[][] matrix = new double[5][5];

        fillMatrix(matrix);

        swapRows(matrix);
        printMatrix(matrix);

        System.out.println();

        swapDiagonals(matrix);
        printMatrix(matrix);
    }
}
