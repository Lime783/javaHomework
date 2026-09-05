package org.example.homework_18_tests.task6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @ParameterizedTest
    @CsvSource({
            "Password1, true",
            "Password, false",
            "password1, false",
            "PASSWORD1, true",
            "pass, false",
            "Aa1, false"
    })
    void isPasswordValidParametrized(String password, boolean expectedResult) {
        assertEquals(expectedResult, PasswordValidator.isPasswordValid(password));
    }
}