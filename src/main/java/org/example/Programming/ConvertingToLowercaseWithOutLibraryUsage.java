package org.example.leetcode;

public class ConvertingToLowercaseWithOutLibraryUsage {
    public static void main(String[] args) {
        String str = "WELCOME";
        String convertedStr = convertToLowerCase(str);
        System.out.println("convertedStr = " + convertedStr);
    }

    private static String convertToLowerCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]>='A' && chars[i]<='Z'){
                chars[i] = (char) (chars[i]+32);
            }
        }
        return new String(chars);
    }

}
