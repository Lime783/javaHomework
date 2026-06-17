package org.example.homework_08_Exceptions;

public class EmailException extends RuntimeException {
    public EmailException(String message) {
        super(message);
    }
}
