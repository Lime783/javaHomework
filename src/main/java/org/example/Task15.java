package org.example;

public class Task15 {

    public static int sumOfDigitsInNumber(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigitsInNumber(1234));
        System.out.println(sumOfDigitsInNumber(4321));
        System.out.println(sumOfDigitsInNumber(111));
        System.out.println(sumOfDigitsInNumber(0));
    }
}
