package org.example.homework_01_if;

import java.util.Scanner;

public class Task09 {

    static public double doOperation(double firstNumber, double secondNumber, String operation) throws Exception {
        return switch (operation) {
            case "+" ->  firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "/" -> {
                if (secondNumber == 0.0){
                    throw new Exception("In division second number needs to be different than 0");
                }
                yield firstNumber / secondNumber;
            }
            case "%" -> firstNumber % secondNumber;
            default -> throw new Exception("Invalid operator");
        };
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double firstNumber;
        double secondNumber;
        String operator;
        double result;

        System.out.print("Enter first number: ");
        firstNumber = scanner.nextDouble();
        System.out.print("Enter second number: ");
        secondNumber = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter an operator (+, -, *, /, %): ");
        operator = scanner.nextLine();
        result = doOperation(firstNumber, secondNumber, operator);

        System.out.println(firstNumber + " " + operator + " " + secondNumber + " = " + result);
    }
}
