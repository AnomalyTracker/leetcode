package org.example.leetcode;

public class AllPermutationOfString {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("All Permutations of the given String : ");
        generatePermutations(str,"");
    }

    private static void generatePermutations(String str, String result) {
        if (str.isEmpty()){
            System.out.println(result);
        }

        for (int i = 0; i < str.length(); i++) {

            char currentChar = str.charAt(i);

            String remainStr = str.substring(0,i) + str.substring(i+1);

            generatePermutations(remainStr, result+currentChar);
        }
    }
}
