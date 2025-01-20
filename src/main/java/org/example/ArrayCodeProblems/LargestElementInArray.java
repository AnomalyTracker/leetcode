package org.example.leetcode.ArrayCodeProblems;

import java.util.Arrays;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,2};
        int largestNum = findLargest(nums);
        System.out.println("largestNum = " + largestNum);
        int largestByJava8 = findLargestByJava8(nums);
        System.out.println("largestByJava8 = " + largestByJava8);
    }

    private static int findLargestByJava8(int[] nums) {
        return Arrays.stream(nums).max().getAsInt();
    }

    private static int findLargest(int[] nums) {
        int largest = nums[0];
        for (int num : nums){
            if(num>largest){
                largest = num;
            }
        }
        return largest;
    }
}
