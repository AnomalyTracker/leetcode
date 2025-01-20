package org.example.array;

public class ReSizeArray {
    public static void main(String[] args) {
        int[] nums = {3,2,7,4,6,8,9,5,11};
        System.out.println("initial Size of Array nums = "+nums.length);
        nums = reSizeArray(nums,nums.length+6);
        System.out.println("Size of Array after resizing = "+nums.length);
    }

    private static int[] reSizeArray(int[] nums, int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < nums.length; i++) {
            temp[i]=nums[i];
        }
        nums = temp;
        return nums;
    }
}
