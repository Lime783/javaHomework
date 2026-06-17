package org.example.homework_04_functions;

public class Task16 {

    public static int sumOfDigitsInNumber(int number) {
        if (number % 10 == 0) {
            return number;
        }

        return number % 10 + sumOfDigitsInNumber(number/10);
    }

        public static void main(String[] args) {
            System.out.println(sumOfDigitsInNumber(1234));
            System.out.println(sumOfDigitsInNumber(4321));
            System.out.println(sumOfDigitsInNumber(111));
            System.out.println(sumOfDigitsInNumber(0));
    }
}
