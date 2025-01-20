package org.example.leetcode;

import java.util.*;

public class FindTheFrequencyOfGivenIntegerArray {
    public static void main(String[] args) {
        int[] arr = {1,1,4,5,4,7,6,8,2,2,3,4,5,3,9};
        List<Map.Entry<Integer, Integer>> theFrequency = findTheFrequency(arr);
        System.out.println("theFrequency = " + theFrequency);

    }

    private static List<Map.Entry<Integer, Integer>> findTheFrequency(int[] arr) {
        Map<Integer,Integer> frequencyMap = new HashMap<>();
        for (int num : arr){
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            System.out.println(entry.getKey()+"---"+ entry.getValue());
        }
        List<Map.Entry<Integer,Integer>> mapToList = new ArrayList<>(frequencyMap.entrySet());
        return mapToList;
    }
}
