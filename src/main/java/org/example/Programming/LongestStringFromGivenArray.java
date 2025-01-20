package org.example.leetcode;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestStringFromGivenArray {
    public static void main(String[] args) {
        String[] strArray = {"java", "Springboot", " microservices","Hibernate"};
        String longestString = Arrays.stream(strArray).reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
        System.out.println("longestString = " + longestString);
        
        //to find lowest LengthString
        String lowestString = Arrays.stream(strArray).reduce((word1, word2) -> word1.length() > word2.length() ? word2 : word1).get();
        System.out.println("lowestString = " + lowestString);
    }
}
