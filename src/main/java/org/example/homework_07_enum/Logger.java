package org.example.homework_07_enum;

public enum Logger {
    INSTANCE;

    void logInConsole(String message) {
        System.out.println(message);
    }
}
