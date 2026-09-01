package org.example.homework_17_annotations.task1;

import java.lang.reflect.Field;

public class PasswordValidator {
    private static final String AT_LEAST_ONE_DIGIT = ".*\\d.*";
    private static final String AT_LEAST_ONE_SPECIAL_CHARACTER = ".*[^a-zA-Z0-9].*";

    static boolean validate(Object object) {
        Class<?> classunia = object.getClass();

        for (Field field : classunia.getDeclaredFields()) {
            if (field.isAnnotationPresent(PasswordValidation.class)) {
                PasswordValidation annotation = field.getAnnotation(PasswordValidation.class);
                field.setAccessible(true);
                try {
                    String password = field.get(object).toString();
                    if (password.length() < annotation.minLength()) {
                        throw new IllegalArgumentException("Password (" + password + ") length should be at least " + annotation.minLength());
                    }
                    if (annotation.requireDigit() && !(password.matches(AT_LEAST_ONE_DIGIT))) {
                        throw new IllegalArgumentException("Password (" + password + ") must contain at least one digit");
                    }
                    if (annotation.requireSpecialCharacter() && !(password.matches(AT_LEAST_ONE_SPECIAL_CHARACTER))) {
                        throw new IllegalArgumentException("Password (" + password + ") must contain at least one special character");
                    }
                } catch (IllegalAccessException e) {
                    System.out.println(e.getMessage());
                    return false;
                }
            }
        }
        System.out.println("Password validated successfully");
        return true;
    }
}
