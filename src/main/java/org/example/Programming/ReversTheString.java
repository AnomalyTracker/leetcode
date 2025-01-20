package org.example.leetcode;

public class ReversTheString {
    public static void main(String[] args) {
        String str = "welcome";
        String reversedString = reverseStrings(str);
        System.out.println("reversedString = " + reversedString);
    }

    public static String reverseStrings(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right= str.length()-1;
        while (left<right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
        System.out.println(chars);
        return new String(chars);
    }

}
