package org.example.leetcode;

public class LargestCommonDivisorOfString {
    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "AB";
        String gcdOfStrings = findGcdOfStrings(str1,str2);
        System.out.println("gcdOfStrings = " + gcdOfStrings);
    }

    private static String findGcdOfStrings(String str1, String str2) {
        if (!(str1+str2).equals(str2+str1)){
            return "";
        }

        return str1.substring(0,gcd(str1.length(),str2.length()));
    }

    private static int gcd(int length1, int length2) {
        if(length2==0){
            return length1;
        }
        return gcd(length2,length1%length2);
    }
}
