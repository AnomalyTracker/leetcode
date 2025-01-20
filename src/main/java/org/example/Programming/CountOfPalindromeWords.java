package org.example.leetcode;

import java.util.Arrays;

public class CountOfPalindromeWords {
    public static void main(String[] args) {
        String str = "mom dad child";
        System.out.println("Number of Palindrome words "+ countPalindrome(str));
    }

    private static long countPalindrome(String str) {
        return Arrays.stream(str.split("\\s+")).filter(CountOfPalindromeWords::isPalindrome).count();
    }

    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        while (left<right){
            if (s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
