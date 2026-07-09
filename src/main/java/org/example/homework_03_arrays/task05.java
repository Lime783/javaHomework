package org.example.homework_03_arrays;

public class task05 {
    public static void main(String[] args) {
        int[]  tabOfInt = {0,0,1,3};
        double sum = 0;

        for (int i = 0; i < tabOfInt.length; i++) {
            sum += tabOfInt[i];
        }
        System.out.print(sum/tabOfInt.length);
    }
}
