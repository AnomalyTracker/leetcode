package org.example.leetcode.ArrayCodeProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumForIndex {
    public static void main(String[] args) {
        int[] nums = {2,6,5,8,11};
        int target = 14;
        int[] indexs = findIndexOfTwoSumEqualsTarget(nums,target);
        System.out.println(Arrays.toString(indexs));
    }

    private static int[] findIndexOfTwoSumEqualsTarget(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target-nums[i];
            if (map.containsKey(temp)){
                return new int[]{i, map.get(temp)};
            }
            map.put(nums[i], i);
        }
        return new int[0];

//        Arrays.sort(nums);
//        int i=0;
//        int j=nums.length-1;
//        while(i< nums.length && j>=0){
//            int sum = nums[i]+nums[j];
//            if (sum==target){
//                return new int[]{i,j};
//            } else if (sum <target) {
//                i++;
//            }else
//                j--;
//        }
//        return new int[0];
    }
}
