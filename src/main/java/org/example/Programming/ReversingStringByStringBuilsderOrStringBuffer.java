package org.example.leetcode;

public class ReversingStringByStringBuilsderOrStringBuffer {
    public static void main(String[] args) {
        String str = "welcome";
        String reversedStringUsingStringBuilder = reversedStringUsingStringBuilder(str);
        System.out.println("reversedString = " + reversedStringUsingStringBuilder);
        
        String reversedStringUsingStringBuffer = reversedStringUsingStringBuffer(str);
        System.out.println("reversedStringUsingStringBuffer = " + reversedStringUsingStringBuffer);
    }

    private static String reversedStringUsingStringBuffer(String str) {
        return new StringBuffer(str).reverse().toString();
    }

    private static String reversedStringUsingStringBuilder(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    
    
}
