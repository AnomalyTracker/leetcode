package org.example.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfWordInList {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "apple");
        long occurance = words.stream().filter(word -> word.equals("apple")).count();
        System.out.println("In the given list of words there were about "+ occurance+" apples");
        Map<String, Long> mapWords = words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("mapWords = " + mapWords);
        System.out.println(mapWords.get("apple")+", "+mapWords.hashCode());
    }
}
