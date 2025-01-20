package org.example.leetcode;

public class MoveAllZerosToEndOfArray {
    public static void main(String[] args) {
        int start=0;
        int[] nums = {0,1,0,3,12};
        for (int i=0;i<nums.length;i++ ){
            if (nums[i]!=0){
                nums[start]=nums[i];
                start++;
            }
        }
        for (int i=start;i<nums.length;i++){
            nums[start++]=0;
        }
        for (int num: nums){
            System.out.print(num+", ");
        }
    }
}
