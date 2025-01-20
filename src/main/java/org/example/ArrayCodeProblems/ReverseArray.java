package org.example.leetcode.ArrayCodeProblems;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        reverseArray(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void reverseArray(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while (left<right){
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}
