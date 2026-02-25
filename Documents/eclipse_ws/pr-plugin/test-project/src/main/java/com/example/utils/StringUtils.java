package com.example.utils;

/**
 * Utility class for string manipulation operations.
 */
public class StringUtils {
    
    /**
     * Capitalizes the first letter of a string.
     * 
     * @param input the string to capitalize
     * @return the capitalized string
     */
    public static String capitalize(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }
    
    /**
     * Reverses a string.
     * 
     * @param input the string to reverse
     * @return the reversed string
     */
    public static String reverse(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }
    
    /**
     * Checks if a string is null or empty.
     * 
     * @param input the string to check
     * @return true if the string is null or empty, false otherwise
     */
    public static boolean isEmpty(String input) {
        return input == null || input.trim().isEmpty();
    }
}
