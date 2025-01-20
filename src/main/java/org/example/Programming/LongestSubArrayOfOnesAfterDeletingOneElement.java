package org.example.leetcode;

public class LongestSubArrayOfOnesAfterDeletingOneElement {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,0,1,1,0,1};
        int maxOnes = findLongestSubArrayOfOnesAfterDeletingOneElement(nums);
        System.out.println("maxOnes = " + maxOnes);
    }

    private static int findLongestSubArrayOfOnesAfterDeletingOneElement(int[] nums) {
        int start = 0;
        int zerosCount=0;
        int maxOnes =0;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end]==0){
                zerosCount++;
            }
            while(zerosCount>1){
                if (nums[start]==0){
                    zerosCount--;
                }
                start++;
            }
            maxOnes = Math.max(maxOnes, end-start);
        }
        return maxOnes;
    }
}
