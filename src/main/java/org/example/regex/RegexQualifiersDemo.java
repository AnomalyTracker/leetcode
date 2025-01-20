package org.example.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQualifiersDemo {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("aa+");
        Matcher m = p.matcher("abaaabbcssaa");
        while(m.find()){
            System.out.println(m.group()+" found at start index "+m.start()+" end index "+m.end());
        }
    }
}
