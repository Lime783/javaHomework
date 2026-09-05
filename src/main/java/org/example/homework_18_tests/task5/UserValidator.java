package org.example.homework_18_tests.task5;

public class UserValidator {
    public static boolean validateEmail(String email) {
        // zakladam w miare rozsadny email
        if (email == null) {
            throw new NullPointerException("Email cannot be null");
        }

        if (email.isEmpty()) {
            throw new IllegalArgumentException("Email cannot be empty");
        }

        if (!(email.contains("@"))) {
            throw new IllegalArgumentException("Email doesn't contain an @");
        }

        return true;
    }
}
