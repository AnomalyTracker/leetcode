package org.example.leetcode.ArrayCodeProblems;

import java.util.Arrays;
import java.util.Map;

public class MovingAllZerosToEndOfArray {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        int[] finalArray = moveZerosToEndOfArray(nums);
        System.out.println("Arrays.toString(finalArray) = " + Arrays.toString(finalArray));
    }

    private static int[] moveZerosToEndOfArray(int[] nums) {
        int start=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                nums[start]=nums[i];
                start++;
            }
        }
        for (int i = start; i < nums.length; i++) {
            nums[start]=0;
        }
        return nums;
    }
}
