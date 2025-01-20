package org.example.leetcode.ArrayCodeProblems;

public class RemoveDuplicateInSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,3,3,4,5};
        int sizeOfUniqueArray = getSizeOfNewUniqueArray(nums);
        System.out.println("sizeOfUniqueArray = " + sizeOfUniqueArray);
    }

    private static int getSizeOfNewUniqueArray(int[] nums) {
        int i=0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=nums[i]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
    }
}
