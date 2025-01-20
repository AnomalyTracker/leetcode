package org.example.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "nat", "tan", "ate", "bat"};
        List<List<String>> result = groupAnagrams(strs);

        // Printing the result in the desired format
        System.out.println(result);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        return Arrays.stream(strs).collect(Collectors.groupingBy(str ->{
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            return new String(charArray);
        })).values().stream().collect(Collectors.toList()); // Collect into a List<List<String>>
    }
}
