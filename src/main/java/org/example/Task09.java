package org.example;

public class Task09 {

    public static int calculateFactorial(int number) {
        int result = 1;
        if (number == 0) {
            return 1;
        }
        result *= number * calculateFactorial(number - 1);
        return result;
    }

    public static void main(String[] args) {
        System.out.print(calculateFactorial(4));
    }
}
