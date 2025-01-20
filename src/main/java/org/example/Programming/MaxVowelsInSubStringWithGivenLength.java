package org.example.leetcode;

import java.util.Scanner;

public class MaxVowelsInSubStringWithGivenLength {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str = "abciiidef";
        System.out.println("Enter the length of substring");
        int k = sc.nextInt();
        int maxVowels = findMaxVowelsSubString(str,k);
        System.out.println("maxVowels = " + maxVowels);
    }

    private static int findMaxVowelsSubString(String str, int k) {
        int maxVowels = 0;
        for (int i = 0; i < str.length(); i++) {
            int vowels = 0;
            for (int j = i; j < Math.min(i+k,str.length()); j++) {
                char c = str.charAt(j);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    vowels++;
                }
            }
            maxVowels = Math.max(maxVowels, vowels);
        }
        return maxVowels;
    }
}
