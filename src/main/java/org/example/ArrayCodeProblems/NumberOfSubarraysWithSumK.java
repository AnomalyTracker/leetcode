package org.example.leetcode.ArrayCodeProblems;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfSubarraysWithSumK {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 3;
        int count = findNumberOfSubArraysWithSumK(nums, k);
        System.out.println("count = " + count);
    }

    private static int findNumberOfSubArraysWithSumK(int[] nums, int k) {
        Map<Integer, Integer> subNum = new HashMap<>();
        subNum.put(0, 1);
        int sum =0;
        int count = 0;
        for(int num : nums){
            sum+=num;
            if(subNum.containsKey(sum-k)){
                count+=subNum.get(sum-k);
            }
            subNum.put(sum,subNum.getOrDefault(sum, 0)+1);
        }
        return count;
    }
}
