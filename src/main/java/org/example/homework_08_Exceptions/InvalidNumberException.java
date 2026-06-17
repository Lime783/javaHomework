package org.example.homework_08_Exceptions;

class InvalidNumberException extends RuntimeException {
    public InvalidNumberException(String msg, Throwable cause) { super(msg, cause); }
}
