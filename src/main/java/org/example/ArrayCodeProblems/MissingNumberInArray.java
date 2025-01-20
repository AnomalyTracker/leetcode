package org.example.leetcode.ArrayCodeProblems;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] nums = {1};
        int missingNumber = findMissingNumber(nums);
        System.out.println("missingNumber = " + missingNumber);
    }

    private static int findMissingNumber(int[] nums) {
        //int n = nums.length+1;
        /*int sumOfNaturalNums= (n*(n+1))/2;

        int sumOfGivenNums = 0;
        for (int i = 0; i < n-1; i++) {
            sumOfGivenNums = sumOfGivenNums+nums[i];
        }

        return sumOfNaturalNums-sumOfGivenNums;*/

        /*int xorAllNumbers = 0;
        int xorArrayElements = 0;

        // XOR all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            xorAllNumbers ^= i;
        }

        // XOR all elements in the array
        for (int num : nums) {
            xorArrayElements ^= num;
        }

        // The missing number is the XOR of these two results
        return xorAllNumbers ^ xorArrayElements;*/

        int xorAllNumbers = 0;
        int xorArrayElements = 0;
        for (int i = 0; i < nums.length; i++) {
            xorArrayElements ^=nums[i];
            xorAllNumbers ^=(i+1);
        }
        xorAllNumbers ^=nums.length+1;
        return xorAllNumbers^xorArrayElements;
    }
}
