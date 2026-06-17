package org.example.homework_08_Exceptions;

final class NumberParser {
    static void parsePositiveInt(String PositiveStringToParseIntoInt) {
        try {
            int value = Integer.parseInt(PositiveStringToParseIntoInt);
            if (value < 0) {
                throw new IllegalArgumentException("Value must be a positive integer: " + PositiveStringToParseIntoInt);
            }
            System.out.println("Number " + PositiveStringToParseIntoInt + " successfully parsed");
        } catch (NumberFormatException e) {
            throw new InvalidNumberException("Invalid number: " + PositiveStringToParseIntoInt, e);
        }
    }
}