package org.example.homework_18_tests.task6;

public class PasswordValidator {

    static String AT_LEAST_ONE_UPPERCASE_CHARACTER = ".*[A-Z].*";
    static String AT_LEAST_ONE_DIGIT = ".*\\d.*";

    public static boolean isPasswordValid(String password) {
        if (!(isLengthValid(password))) {
            return false;
        }

        if (!(hasAtLeastOneUppercaseCharacter(password))) {
            return false;
        }

        if (!(hasAtLeastOneDigit(password))) {
            return false;
        }

        return true;
    }

    private static boolean isLengthValid(String password) {
        return password.length() >= 8;
    }

    private static boolean hasAtLeastOneUppercaseCharacter(String password) {
        return password.matches(AT_LEAST_ONE_UPPERCASE_CHARACTER);
    }

    private static boolean hasAtLeastOneDigit(String password) {
        return password.matches(AT_LEAST_ONE_DIGIT);
    }
}
