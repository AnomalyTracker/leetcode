package org.example.leetcode;

public class TwoSum {
    public static void main(String[] args) {
       int[] nums = {2,7,11,5};
       int target = 9;
       int[] result = twoSum(nums, target);

        if (result != null) {
            System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        int sum =0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                sum = nums[i]+nums[j];
                if(sum == target){
                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }
        }

        return null;
    }
}
