package org.example.leetcode;

import java.util.Arrays;

public class PivotIndex {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int index = findPivotIndex(nums);
        System.out.println("index = " + index);
    }

    private static int findPivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = Arrays.stream(nums).sum();
        int pivotIndex = 0;
        while(pivotIndex< nums.length){
            rightSum -= nums[pivotIndex];
            if(leftSum == rightSum){
                return pivotIndex;
            }
            else {
                leftSum += nums[pivotIndex];
                pivotIndex++;
            }
        }
        return -1;
    }
}
