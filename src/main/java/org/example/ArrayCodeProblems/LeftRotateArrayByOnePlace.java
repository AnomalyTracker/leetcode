package org.example.leetcode.ArrayCodeProblems;

import java.util.Arrays;

public class LeftRotateArrayByOnePlace {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int[] finalArray = leftRotateTheArrayByOnePlace(nums);
        System.out.println("finalArray: "+ Arrays.toString(finalArray));
    }

    private static int[] leftRotateTheArrayByOnePlace(int[] nums) {
        int num = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=num;
        return nums;
    }
}
