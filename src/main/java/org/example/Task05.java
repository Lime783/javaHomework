package org.example;

public class Task05 {

    public static double averageOf3Doubles(double double1, double double2, double double3) {
        return (double1 + double2 + double3) / 3;
    }

    public static void main(String[] args) {
        System.out.printf("%.2f", averageOf3Doubles(1.0, 2.0, 3.14));
    }
}
