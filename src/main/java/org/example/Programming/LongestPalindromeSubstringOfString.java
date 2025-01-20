package org.example.leetcode;

public class LongestPalindromeSubstringOfString {
    public static void main(String[] args) {
        String str = "ababase";
        String longestSubString = longestSubStringPalindrome(str);
        System.out.println("longestSubString = " + longestSubString);
    }

    private static String longestSubStringPalindrome(String str) {
        if (str == null || str.length() == 0){
            return "";
        }
        String longest = "";
        for (int i = 0; i < str.length(); i++) {
            String oddPalindrome = checkPalindrome(str,i,i);
            String evenPalindrome = checkPalindrome(str,i, i+1);
            if (oddPalindrome.length()>longest.length()){
                longest = oddPalindrome;
            }
            if (evenPalindrome.length() > longest.length()){
                longest = evenPalindrome;
            }
        }
        return longest;
    }

    private static String checkPalindrome(String str, int left, int right) {
        while(left>=0 && right<str.length() && str.charAt(left) == str.charAt(right)){
            left--;
            right++;
        }
        return str.substring(left+1,right);
    }
}
