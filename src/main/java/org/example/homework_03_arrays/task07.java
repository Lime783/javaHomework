package org.example.homework_03_arrays;

public class task07 {
    public static void main(String[] args) {
        int[]  tabOfInt = {0,-2,1,3,1};
        double min = Double.MAX_VALUE;

        for (int i = 0; i < tabOfInt.length; i++) {
            if (tabOfInt[i] < min) {
                min = tabOfInt[i];
            }
        }
        System.out.print(min);
    }
}