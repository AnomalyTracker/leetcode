package org.example.leetcode;

import java.util.Arrays;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String str = "a good   example";
        String reversedStringWords = reverseWordsInString(str);
        System.out.println("reversedStringWords = " + reversedStringWords);
    }

    private static String reverseWordsInString(String s) {
        String[] str = s.trim().split("\\s+");
        String newString = "";
        for (int i = str.length-1; i >0; i--) {
            if (str[i]==" "){
                continue;
            }
            newString+=str[i]+" ";
        }
        return newString+str[0];
    }
}
