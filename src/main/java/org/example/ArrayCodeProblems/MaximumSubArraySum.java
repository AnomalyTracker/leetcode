package org.example.leetcode.ArrayCodeProblems;

import java.util.Arrays;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int[] maxSubArrSum = findMaxSubArraySum(nums);
        System.out.println("maxSubArrSum = " + Arrays.toString(maxSubArrSum));

    }

    private static int[] findMaxSubArraySum(int[] nums) {
        int start=-1;
        int tempStart=0;
        int end=-1;
        long maxSubArray=nums[0];
        int sum =0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if(sum>maxSubArray){
                maxSubArray=sum;
                start=tempStart;
                end=i;
            }
            if(sum<0){
                sum=0;
                tempStart= i+1;
            }
        }
        System.out.println("maxSubArray = " + maxSubArray);
        return Arrays.copyOfRange(nums, start, end+1);
    }
}
