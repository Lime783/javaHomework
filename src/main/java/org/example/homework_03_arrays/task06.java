package org.example.homework_03_arrays;

public class task06 {
    public static void main(String[] args) {
        int[]  tabOfInt = {0,-2,1,3,1};
        double max = Double.MIN_VALUE;

        for (int i = 0; i < tabOfInt.length; i++) {
            if (tabOfInt[i] > max) {
                max = tabOfInt[i];
            }
        }
        System.out.print(max);
    }
}
