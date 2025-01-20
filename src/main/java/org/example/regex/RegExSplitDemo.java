package org.example.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSplitDemo {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[.]");
        String[] s1 =  p.split("abc@gmail.com");
        for (String str : s1){
            System.out.println(str);
        }
    }
}
