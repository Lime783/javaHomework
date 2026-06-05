package org.example.homework_04_functions;

public class Task08 {

    public static int calculateFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calculateFactorial(3));
        System.out.println(calculateFactorial(4));
        System.out.println(calculateFactorial(5));
    }
}
