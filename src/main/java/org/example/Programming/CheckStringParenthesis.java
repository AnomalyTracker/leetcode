package org.example.leetcode;

import java.util.Stack;

public class CheckStringParenthesis {
    public static void main(String[] args) {
        String str = "{[()]}";
        boolean isValidParenthises = validateStringParenthsis(str);
        System.out.println("isValidParenthises = " + isValidParenthises);
    }

    private static boolean validateStringParenthsis(String str) {
        char[] c = str.toCharArray();
        Stack<Character> s = new Stack<>();
        for (char ch : c){
            if (ch=='(' || ch == '{' || ch == '['){
                s.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (s.empty()){
                    return false;
                }
                char top=s.pop();
                if ((ch == ')' && top!='(') || (ch == '}' && top!='{') || (ch == ']' && top!='[')){
                    return false;
                }
            }
        }
        return s.isEmpty();
    }
}
