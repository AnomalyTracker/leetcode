package org.example.leetcode;

public class ReverseVowelsOfString {
    public static void main(String[] args) {
        String str = "IceCreAm";
        String reversedVowelsString = reverVowelsOfString(str);
        System.out.println("reversedVowelsString = " + reversedVowelsString);
    }

    private static String reverVowelsOfString(String str) {
        char[] chars = str.toCharArray();
        String vowels = "AEIOUaeiou";
        int start = 0;
        int end = chars.length-1;
        while (start<end){
            while (start<end && vowels.indexOf(chars[start]) == -1){
                start++;
            }
            while (start<end && vowels.indexOf(chars[end]) == -1){
                end--;
            }
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] =temp;
            start++;
            end--;
        }
        return new String(chars);
    }
}
