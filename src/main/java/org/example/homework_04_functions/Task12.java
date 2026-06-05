package org.example.homework_04_functions;

public class Task12 {

    public static boolean isIntPrime(int intToCheck) {
        int number = Math.abs(intToCheck);

        if (number <= 2) {
            return true;
        } else {
            for (int i = 2; i <= (number / 2) + 1; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIntPrime(12) ? "Prime Number" : "Not Prime Number");
        System.out.println(isIntPrime(5) ? "Prime Number" : "Not Prime Number");
    }
}
