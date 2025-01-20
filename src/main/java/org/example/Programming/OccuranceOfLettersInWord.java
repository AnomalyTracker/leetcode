package org.example.leetcode;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceOfLettersInWord {
    public static void main(String[] args) {
        String word = "welcomeToJava";
        String[] characters = word.split("");
        Map<String, Long> mapchars = Arrays.stream(characters).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println("mapchars = " + mapchars);
        //Find Duplicate chars in given word
        List<String> filterDuplicates = mapchars.entrySet()
                .stream().filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println("filterDuplicates = " + filterDuplicates);

        //Find first Non-repeat element in string

        String firstNonRepeatElement = mapchars.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().get()
                .getKey();
        System.out.println("firstNonRepeatElement = " + firstNonRepeatElement);
    }
    
}
