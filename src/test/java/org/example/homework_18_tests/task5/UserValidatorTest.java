package org.example.homework_18_tests.task5;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTest {

    private String email;

    @Nested
    class CorrectEmail {
        @Test
        void shouldBeCorrectEmail() {
            email = "eniu@tuta.com";
            assertTrue(UserValidator.validateEmail(email));
        }
    }

    @Nested
    class IncorrectEmail {
        @Test
        void shouldBeIncorrectEmailWithoutAtSymbol() {
            email = "eniu#tuta.com";
            assertThrows(IllegalArgumentException.class, () -> UserValidator.validateEmail(email));
        }

        @Test
        void shouldBeIncorrectEmailAsNull() {
            email = null;
            assertThrows(NullPointerException.class, () -> UserValidator.validateEmail(email));
        }
    }

    @Nested
    class ExceptionMessage {
        @Test
        void shouldNullPointerExceptionContainWordEmail() {
            email = null;
            NullPointerException exception = assertThrows(NullPointerException.class, () -> UserValidator.validateEmail(email));

            assertTrue(exception.getMessage().contains("Email"));
        }

        @Test
        void shouldIllegalArgumentExceptionContainWordEmail() {
            email = "eniu#tuta.com";
            IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> UserValidator.validateEmail(email));

            assertTrue(exception.getMessage().contains("Email"));
        }
    }
}