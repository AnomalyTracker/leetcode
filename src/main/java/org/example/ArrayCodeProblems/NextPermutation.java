package org.example.leetcode.ArrayCodeProblems;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};

        getNextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void getNextPermutation(int[] nums) {
        int index= -1;
        for (int i = nums.length-2; i >=0 ; i--) {
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }
        if(index==-1){
            int left = 0;
            int right = nums.length-1;
            reverseArray(nums,left,right);
        }
        else {
            int temp = nums[index];
            for (int i = nums.length-1; i >=0 ; i--) {
                if(temp<nums[i]){
                    swap(nums,index,i);
                    break;
                }
            }
            reverseArray(nums, index+1, nums.length-1);
        }
    }

    private static void swap(int[] nums, int index, int i) {
        int temp = nums[index];
        nums[index]=nums[i];
        nums[i]=temp;
    }


    private static void reverseArray(int[] nums,int left , int right) {
        while (left<right){
            int temp = nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
    }
}
