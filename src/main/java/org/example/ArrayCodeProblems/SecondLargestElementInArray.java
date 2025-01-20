package org.example.leetcode.ArrayCodeProblems;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int[] nums = {4,4};
        int secondLargestNum = find2ndLargestNum(nums);
        if (secondLargestNum !=Integer.MIN_VALUE){
            System.out.println("secondLargestNum = " + secondLargestNum);
        }
        else
            System.out.println("No SecondLargest number");
    }

    private static int find2ndLargestNum(int[] nums) {
        int largest = nums[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int num : nums){
            if(num>largest){
                secondLargest = largest;
                largest = num;
            }
        }
        return secondLargest;
    }
}
