package org.example.leetcode;

public class ReversingStringWithCharArray {
    public static void main(String[] args) {
        String str = "welcome";
        String reversedString = reverseString(str);
        System.out.println("reversedString = " + reversedString);
    }

    private static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int i = 0;
        int j = chars.length-1;
        while(i < j){
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }
}
