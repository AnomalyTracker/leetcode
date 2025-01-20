package org.example.leetcode;

public class ConvertingToUppercaseWithOutLibraryUsage {
    public static void main(String[] args) {
        String str = "WelcomE";
        String convertedString = convertToUppercase(str);
        System.out.println("convertedString = " + convertedString);
    }

    private static String convertToUppercase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]>='a' && chars[i]<='z'){
                chars[i]= (char) (chars[i]-32);
            }
        }
        return new String(chars);
    }
}
