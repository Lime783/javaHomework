package org.example.homework_17_annotations.task1;

public class User {
    @PasswordValidation(minLength = 10, requireSpecialCharacter = true)
    private final String password;

    public User(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
