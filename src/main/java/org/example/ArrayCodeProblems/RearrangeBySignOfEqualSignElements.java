package org.example.leetcode.ArrayCodeProblems;

import java.util.Arrays;

public class RearrangeBySignOfEqualSignElements {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        int[] resultNums = reArrangeAlternateSignedElemtes(nums);
        System.out.println("resultNums = " + Arrays.toString(resultNums));
    }

    private static int[] reArrangeAlternateSignedElemtes(int[] nums) {
        int[] resultArray = new int[nums.length];
        int even=0;
        int odd =1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>0){
                resultArray[even]=nums[i];
                even+=2;
            } else {
                resultArray[odd]=nums[i];
                odd+=2;
            }
        }
        return resultArray;
    }
}
