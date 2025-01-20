package org.example.leetcode;

import java.util.*;

public class MapSortingByLambda {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("eight",8);
        map.put("two",2);
        map.put("ten",10);
        map.put("four",4);

        List<Map.Entry<String,Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries,(o1, o2) -> o1.getValue().compareTo(o2.getValue()));
        for (Map.Entry<String,Integer> entry : entries){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }

        //using Lambda Expression
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    }
}
