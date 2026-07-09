package org.example.homework_03_arrays;

public class task19 {
    public static void main(String[] args) {
        int[][] matrix = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = i * 10 + j;
                if (i == j) {
                    System.out.printf("%02d ", matrix[i][j]);
                }
            }
        }
    }
}