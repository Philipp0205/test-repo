package com.example.utils;

/**
 * Utility class for mathematical operations.
 */
public class MathUtils {
    
    /**
     * Adds two integers.
     * 
     * @param a first number
     * @param b second number
     * @return sum of a and b
     */
    public static int add(int a, int b) {
        return a + b;
    }
    
    /**
     * Subtracts two integers.
     * 
     * @param a first number
     * @param b second number
     * @return difference of a and b
     */
    public static int subtract(int a, int b) {
        return a - b;
    }
    
    /**
     * Multiplies two integers.
     * 
     * @param a first number
     * @param b second number
     * @return product of a and b
     */
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    /**
     * Checks if a number is even.
     * 
     * @param number the number to check
     * @return true if the number is even, false otherwise
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
