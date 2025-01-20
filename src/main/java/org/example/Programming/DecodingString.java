package org.example.leetcode;

import java.util.Stack;

public class DecodingString {
    public static void main(String[] args) {
        String str = "3[a]2[bc]";
        String decodedString = decodeString(str);
        System.out.println("decodedString = " + decodedString);
    }

    private static String decodeString(String str) {
        Stack<String> strStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        return null;
    }
}
