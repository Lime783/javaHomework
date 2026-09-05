package org.example.homework_18_tests.task3;

public class StringUtils {
    static public boolean isPalindrome(String text) {
        if (text == null || text.isEmpty()) {
            return true;
        }
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }
}
