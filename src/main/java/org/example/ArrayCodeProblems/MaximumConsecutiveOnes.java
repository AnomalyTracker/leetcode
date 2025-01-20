package org.example.leetcode.ArrayCodeProblems;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        int maxConsecutiveOnes = findMaxConsecutiveOnes(nums);
        System.out.println("maxConsecutiveOnes = " + maxConsecutiveOnes);
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int consecutiveCount = 0;
        int maxConsecutiveOnes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1){
                consecutiveCount++;
            }
            else
                consecutiveCount=0;
            maxConsecutiveOnes = Integer.max(maxConsecutiveOnes, consecutiveCount);
        }
        return maxConsecutiveOnes;
    }
}
