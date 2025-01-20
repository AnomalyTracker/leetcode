package org.example.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {
    public static void main(String[] args) {
        int[] nums = {1,2};
        boolean isUniqueOccurrences = checkUniqueOccurrences(nums);
        System.out.println("isUniqueOccurrences = " + isUniqueOccurrences);
    }

    private static boolean checkUniqueOccurrences(int[] nums) {
        Map<Integer, Integer> mapNums = new HashMap<>();
        for (int num: nums){
            mapNums.put(num, mapNums.getOrDefault(num,0)+1);
        }
        Set<Integer> addOccurrences = new HashSet<>();
        for (int num : mapNums.values()){
            if (!addOccurrences.add(num)){
                return false;
            }
        }
        return true;
    }
}
