package org.example.homework_03_arrays;

public class task04 {
    public static void main(String[] args) {
        int[]  tabOfInt = {1,1,1,3};
        double sum = 0;

        for (int i = 0; i < tabOfInt.length; i++) {
            sum += tabOfInt[i];
        }
        System.out.print(sum);
    }
}
