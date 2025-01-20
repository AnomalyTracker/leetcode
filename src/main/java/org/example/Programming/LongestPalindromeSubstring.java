package org.example.leetcode;

public class LongestPalindromeSubstring {

    // Function to expand around the center and find the longest palindrome
    public static String expandAroundCenter(String s, int left, int right) {
        // Expand while the characters are equal
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // Return the palindrome substring
        return s.substring(left + 1, right);
    }

    // Main function to find the longest palindrome substring
    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String longest = ""; // To store the longest palindrome found

        // Try to expand around each character (odd-length) and between characters (even-length)
        for (int i = 0; i < s.length(); i++) {
            String oddPalindrome = expandAroundCenter(s, i, i);  // Odd-length palindrome
            String evenPalindrome = expandAroundCenter(s, i, i + 1);  // Even-length palindrome

            // Update the longest palindrome found
            if (oddPalindrome.length() > longest.length()) {
                longest = oddPalindrome;
            }
            if (evenPalindrome.length() > longest.length()) {
                longest = evenPalindrome;
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(longestPalindrome("babad"));  // Output: "bab" or "aba"
        System.out.println(longestPalindrome("cbbd"));   // Output: "bb"
        System.out.println(longestPalindrome("a"));      // Output: "a"
        System.out.println(longestPalindrome("ac"));     // Output: "a"
    }
}

