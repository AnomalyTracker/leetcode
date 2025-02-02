package org.example.leetcode.ArrayCodeProblems;

public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int SingleNumber = findSingleNumber(nums);
        System.out.println("SingleNumber = " + SingleNumber);
    }

    private static int findSingleNumber(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor^nums[i];
        }
        return xor;
    }
}
