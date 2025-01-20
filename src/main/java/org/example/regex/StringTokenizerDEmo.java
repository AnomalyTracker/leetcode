package org.example.regex;

import java.util.StringTokenizer;

public class StringTokenizerDEmo {
    public static void main(String[] args) {
        /*StringTokenizer st = new StringTokenizer("welcome to Java String Tockenizer");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }*/
        /*StringTokenizer st = new StringTokenizer("wilcome@gmail.com","@");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }*/
        StringTokenizer st = new StringTokenizer("wilcome@gmail.com");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken("@"));
        }
    }
}
