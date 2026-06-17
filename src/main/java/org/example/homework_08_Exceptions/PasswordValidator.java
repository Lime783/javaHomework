package org.example.homework_08_Exceptions;

import java.util.Objects;

public final class PasswordValidator {

    private static boolean isThereAnyNumber(String password) {
        return password.matches(".*\\d.*");
    }

    public static void validate(String password) {
        if (Objects.isNull(password)) {
            throw new IllegalArgumentException("Password cannot be a null");
        }
        if (password.length() < 8) {
            throw new IllegalArgumentException("Password is too short (length < 8): " + password);
        }
        if (!(isThereAnyNumber(password))) {
            throw new IllegalArgumentException("Password must contain at least 1 number: " + password);
        }
        System.out.println("Password \"" + password + "\" is valid");
    }
}
