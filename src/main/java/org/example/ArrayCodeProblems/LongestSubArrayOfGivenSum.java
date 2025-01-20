package org.example.leetcode.ArrayCodeProblems;

public class LongestSubArrayOfGivenSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,1,1,4,2,3};
        int k = 3;
        int maxSubArray= findLongestSubArrayOfGivenSum(nums,k) ;
        System.out.println("maxSubArray = " + maxSubArray);
    }

    private static int findLongestSubArrayOfGivenSum(int[] nums, int k) {
        int i=0;
        int j=0;
        int maxLength=0;
        int sum = 0;
        while(j< nums.length ){
            sum+=nums[j];

            while (sum>k && i<=j){
                sum = sum-nums[i];
                i++;
            }
            if (sum==k){
                maxLength = Math.max(maxLength, (j-i)+1);
            }
            j++;
        }
        System.out.println("i: "+i);
        System.out.println("j: "+j);
        return maxLength;
    }
}
