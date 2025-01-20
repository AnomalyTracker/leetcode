package org.example.leetcode;

import java.util.*;

public class NthMostFrequentElement {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,2,3,4,4,3};
        System.out.println("Please enter the Nth value");
        int nth = sc.nextInt();
        int nthMostFrequentElement=findNthMostFrequentElement(arr,nth);
        System.out.println("nthMostFrequentElement = " + nthMostFrequentElement);
    }

    private static int findNthMostFrequentElement(int[] arr, int nth) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr){
            frequencyMap.put(num,frequencyMap.getOrDefault(num,0)+1);
        }
        List<Map.Entry<Integer, Integer>> sortMaps = new ArrayList<>(frequencyMap.entrySet());


        System.out.println("sortMapsBefore = " + sortMaps);
        sortMaps.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));
        System.out.println("sortMapsAfter = " + sortMaps);
        if (nth > 0 && nth <= sortMaps.size()){
            return sortMaps.get(nth-1).getKey();
        }else {
            throw new IllegalArgumentException("N is out of bounds");
        }
    }
}
