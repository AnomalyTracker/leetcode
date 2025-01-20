package org.example.leetcode.ArrayCodeProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100,4,200,1,3,2};
        int length = findLongestConsecutive(nums);
        System.out.println("length = " + length);
    }

    private static int findLongestConsecutive(int[] nums) {
//        Arrays.sort(nums);
//        int start = 0;
//        int longest = 1;
//        for (int i = 1; i < nums.length; i++) {
//           if(nums[i]-nums[i-1]!=1){
//               start=i;
//           }
//           longest = Math.max(longest, i-start+1);
//        }
//        return longest;

        int longest = 1;
        Set<Integer> uniqueNums = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            uniqueNums.add(nums[i]);
        }
        for(int num : uniqueNums){
            if(!uniqueNums.contains(num-1)){
                int count =1;
                int value = num;
                while(uniqueNums.contains(value+1)){
                    count++;
                    value+=1;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

}
