package org.example.leetcode;

import java.util.Collections;
import java.util.Stack;

public class RemoveStartsAlongWithNonStarsInString {
    public static void main(String[] args) {
        String str = "leet**cod*e";
        String resultString = removeStarsAlongWithNonStars(str);
        System.out.println("resultString = " + resultString);
    }

    private static String removeStarsAlongWithNonStars(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()){
            if (c !='*'){
                sb.append(c);
            }
            else {
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
}
