package org.example.homework_08_Exceptions;

import java.util.Objects;
import java.util.regex.Pattern;

public final class EmailValidator {

    private static final Pattern EMAIL = Pattern.compile("^[\\w.+\\-]+@[\\w\\-]+\\.[a-zA-Z]{2,}$");

    static void validate(String email) {
        if (Objects.isNull(email)) {
            throw new EmailNullException("Email is null");
        }
        if (email.isBlank()) {
            throw new EmailEmptyException("Email is empty");
        }
        if (!(EMAIL.matcher(email).matches())) {
            throw new EmailBadFormatException("Invalid email format: "  + email);
        }
        System.out.println("Email \"" + email + "\" is valid");
    }

    /* Zrobilem unchecked exceptiony bo coraz rzadziej pisze sie wlasne checked
     oraz to nie są problemy zewnetrzne, logika jest spoko a to dane
     wewnetrzne moga byc nie spoko */
}
