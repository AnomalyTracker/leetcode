package org.example.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordsByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "Mango", "orange", "ButterFruit");
        Map<Integer, List<String>> listOfWords=words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("Grouped words: "+ listOfWords);
    }
}
