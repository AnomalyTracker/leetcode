package org.example.leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {-1,1,0,-3,3};
        int[] newArray = mapProductOfArrayExceptSelf(nums);
        System.out.println(Arrays.toString(newArray));
    }

    private static int[] mapProductOfArrayExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int[] finalArray = new int[nums.length];
        left[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            left[i] = left[i-1]*nums[i-1];
        }
        right[nums.length-1]=1;
        for (int i = nums.length-2 ; i >=0; i--) {
            right[i]= right[i+1] * nums[i+1];
        }
        for (int i = 0; i < nums.length; i++) {
            finalArray[i] = left[i]*right[i];
        }
        return finalArray;
    }
}
