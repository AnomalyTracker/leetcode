package org.example.String;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String str = "abcabcbb";
        int result = lengthOfLongestSubstring(str);
        System.out.println("result = " + result);
    }

    private static int lengthOfLongestSubstring(String str) {
        int maxlength = 0;
        Map<Character, Integer> charindexmap = new HashMap<>();
        int start = 0;
        for (int end = 0; end<str.length();end++){
            char ch = str.charAt(end);
            if (charindexmap.containsKey(ch) && charindexmap.get(ch)>=start) {
                System.out.println((ch+" is at "+charindexmap.get(ch)));
                System.out.println("start :"+start);
                start = charindexmap.get(ch)+1;
            }
            charindexmap.put(ch,end);
            System.out.println(charindexmap.keySet());
            System.out.println(charindexmap.values());
            maxlength = Math.max(maxlength,end-start+1);
        }
        return maxlength;
    }
}
