package org.example.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"geeksforgeeks", "geek", "geep", "geeks"};
        String longestPrefix = findLongestPrefix(str);
        System.out.println("longestPrefix = " + longestPrefix);
    }

    private static String findLongestPrefix(String[] str) {
        Arrays.sort(str);
        String str1 = str[0];
        String str2 = str[str.length-1];
        int start = 0;
        while (start < str1.length() && start< str2.length()){
            if (str1.charAt(start)!=str2.charAt(start)){
                break;
            }else
                start++;
        }
        return str1.substring(0,start);
    }


}
