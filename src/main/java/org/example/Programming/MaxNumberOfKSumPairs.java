package org.example.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class MaxNumberOfKSumPairs {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] nums = {4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
        System.out.println("Enter the K's Value");
        int k = sc.nextInt();
        int maxNumberOfKSumPairs = findMaxNumberOfKSumPairs(nums,k);
        System.out.println("maxNumberOfKSumPairs = " + maxNumberOfKSumPairs);
    }

    private static int findMaxNumberOfKSumPairs(int[] nums, int k) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int start = 0;
        int end = nums.length-1;
        int numOfOperation = 0;
        while (start<end){
            int temp = nums[start]+nums[end];
            if (temp == k){
                start++;
                end--;
                numOfOperation++;
            } else if(temp>k){
                end--;
            }
            else {
                start++;
            }
        }
        return numOfOperation;
    }
}
