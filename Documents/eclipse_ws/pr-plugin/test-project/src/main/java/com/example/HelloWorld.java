package com.example;

import com.example.utils.StringUtils;
import com.example.utils.MathUtils;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("This is a simple Java test project.");
        
        // Demonstrate utility functions
        String message = "welcome to java";
        System.out.println("Capitalized: " + StringUtils.capitalize(message));
        
        int result = MathUtils.add(5, 10);
        System.out.println("5 + 10 = " + result);
    }
}
