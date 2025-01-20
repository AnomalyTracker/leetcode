package org.example.leetcode;

public class ReverseStringWithRecursion {
    public static void main(String[] args) {
        String str = "welcome";
        String reversedString = reversString(str);
        System.out.println("reversedString = " + reversedString);
    }

    private static String reversString(String str) {
        if (str.isEmpty()){
            return str;
        }
        return reversString(str.substring(1))+str.charAt(0);
    }
}
