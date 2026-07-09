package org.example.homework_03_arrays;

public class task14 {
    public static void main(String[] args) {
        int[][] tabOfInt = {{1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}};

        for (int i = 0; i < tabOfInt.length; i++) {
            for (int j = 0; j < tabOfInt[i].length; j++) {
                System.out.print(tabOfInt[i][j] + " ");
            }
            System.out.println();
        }
    }
}
