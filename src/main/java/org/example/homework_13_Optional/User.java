package org.example.homework_13_Optional;

import java.util.Optional;

class User {
    private String name;
    private String email; // może być null

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}
