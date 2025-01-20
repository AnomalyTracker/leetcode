package org.example.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubStringOccurance {
    public static void main(String[] args) {
        Pattern p = Pattern.compile(".");
        Matcher m = p.matcher("a7bnc3#$ 6");
        //int count = 0;

        while (m.find()){
            //count++;
            System.out.println(("found at index : "+m.start()+" end index "+m.end()+ " Matched group "+m.group()));
        }
        //System.out.println("given pattern exist "+count+ " Number of times");
    }
}
