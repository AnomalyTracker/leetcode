package org.example.String;

import java.util.ArrayList;
import java.util.List;

public class SubstringExtractor {
    public static void main(String[] args) {
        String input = "All possible substrings";  // Example input string
        List<String> substrings = getAllSubstrings(input);

        System.out.println("All possible substrings of '" + input + "':");
        for (String substring : substrings) {
            System.out.println(substring);
        }
    }

    public static List<String> getAllSubstrings(String str) {
        List<String> substrings = new ArrayList<>();
        int length = str.length();

        // Nested loops to find all substrings
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                substrings.add(str.substring(i, j));
            }
        }

        return substrings;
    }
}
