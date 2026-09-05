package org.example.homework_18_tests.task3;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {

    private String text;

    @Nested
    class IsPalindrome {
        @Test
        void shouldBePalindromeNormalText() {
            text = "kajak";
            assertTrue(StringUtils.isPalindrome(text));
        }

        @Test
        void shouldBePalindromeDifferentCapitalization() {
            text = "Kajak";
            assertTrue(StringUtils.isPalindrome(text));
        }
    }

    @Test
    void shouldNotBePalindrome() {
        text = "java";
        assertFalse(StringUtils.isPalindrome(text));
    }

    @Nested
    class SpecialEmptyString {
        @Test
        void shouldBePalindromeNull() {
            text = null;
            assertTrue(StringUtils.isPalindrome(text));
        }

        @Test
        void shouldBePalindromeEmpty() {
            text = "";
            assertTrue(StringUtils.isPalindrome(text));
        }
    }
}