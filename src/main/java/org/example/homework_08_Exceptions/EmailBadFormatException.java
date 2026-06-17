package org.example.homework_08_Exceptions;

public class EmailBadFormatException extends EmailException {
    public EmailBadFormatException(String message) {
        super(message);
    }
}
