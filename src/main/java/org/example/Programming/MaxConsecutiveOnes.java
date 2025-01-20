package org.example.leetcode;

import java.util.Scanner;

public class MaxConsecutiveOnes {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        System.out.println("Enter the K's Value");
        int k = sc.nextInt();
        int maxConsecutiveOnes = findMaxConsecutiveOnes(nums,k);
        System.out.println("maxConsecutiveOnes = " + maxConsecutiveOnes);
    }

    private static int findMaxConsecutiveOnes(int[] nums, int k) {
        int start = 0;
        int zerosCount = 0;
        int max_ones = 0;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end]==0){
                zerosCount++;
            }
            while (zerosCount>k){
                if (nums[start]==0){
                    zerosCount--;
                }
                start++;
            }
            max_ones = Math.max(max_ones,end-start+1);
        }
        return max_ones;
    }
}
