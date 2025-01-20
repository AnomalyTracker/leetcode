package org.example.leetcode.ArrayCodeProblems;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        boolean isArraySorted = checkArrayIsSorted(nums);
        System.out.println("isArraySorted = " + isArraySorted);
    }

    private static boolean checkArrayIsSorted(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]>=nums[i-1]){

            }else
                return false;
        }
        return true;
    }
}
