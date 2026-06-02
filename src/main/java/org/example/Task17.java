package org.example;

public class Task17 {

    public static int BiggestMutualDiviser(int int1, int int2) {
        int number1 = Math.abs(int1), number2 = Math.abs(int2);

        if (number1 == 0 || number2 == 0) {
            return Math.max(number1, number2);
        }

        int max = 0;
        for (int i = 1; i <= Math.min(number1, number2); i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(BiggestMutualDiviser(4, 2));
        System.out.println(BiggestMutualDiviser(7, 7));
        System.out.println(BiggestMutualDiviser(7, 11));
        System.out.println(BiggestMutualDiviser(3, 0));
    }
}
