package org.example.homework_04_functions;

import java.util.Scanner;

public class Task06 {

    public static String ageCategory(int age){
        if (age < 12){
            return "Kid";
        }
        else if (age <= 17){
            return "Teen";
        }
        else if (age <= 64){
            return "Adult";
        }
        else {
            return "Senior";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        System.out.print(ageCategory(scanner.nextInt()));
    }
}
