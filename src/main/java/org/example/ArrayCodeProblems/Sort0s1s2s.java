package org.example.leetcode.ArrayCodeProblems;

import java.util.Arrays;

public class Sort0s1s2s {
    public static void main(String[] args) {
        int[] nums = {2,0,1};
//        Arrays.sort(nums);
        sortElements(nums);
        System.out.println("Sorted array: "+Arrays.toString(nums));

    }

    private static void sortElements(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while(low<=mid && mid<=high){
            if (nums[mid]==0){
                int temp= nums[mid];
                nums[mid]=nums[low];
                nums[low] =temp;
                mid++;
                low++;
            } else if (nums[mid]==1) {
                mid++;
            } else if (nums[mid]==2) {
                int temp= nums[mid];
                nums[mid]=nums[high];
                nums[high] =temp;
                high--;
            }
        }

    }

}
