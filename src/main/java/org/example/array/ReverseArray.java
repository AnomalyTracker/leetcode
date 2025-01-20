package org.example.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {3,2,7,4,6,8,9,5,11};
        //int[] reversedArrayByuNormal = reverseArrayByNormal(nums);
        //System.out.println(Arrays.toString(reversedArrayByuNormal));
        int[] reversedArrayByStream = reverseArrayByStream(nums);
        System.out.println(Arrays.toString(reversedArrayByStream));
    }

    private static int[] reverseArrayByStream(int[] nums) {
        return IntStream.range(0, nums.length).map(i->nums[nums.length-1-i]).toArray();
    }

    private static int[] reverseArrayByNormal(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        return nums;
    }
}
