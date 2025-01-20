package org.example.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinWordsInList {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello"," ","world","!");
        String joinedWords = words.stream().collect(Collectors.joining());
        System.out.println("Sentence after joining the words in the given array is "+joinedWords);
    }
}
