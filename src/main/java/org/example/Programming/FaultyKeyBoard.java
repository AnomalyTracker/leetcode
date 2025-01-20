package org.example.leetcode;

public class FaultyKeyBoard {
    public static void main(String[] args) {
        String str = "string";
        String finalString = getFaultyString(str);
        System.out.println("finalString = " + finalString);
    }

    private static String getFaultyString(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()){
            if (ch == 'i'){
                sb.reverse();
            }else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
