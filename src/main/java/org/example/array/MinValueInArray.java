package org.example.array;

import java.util.Arrays;
import java.util.OptionalInt;

public class MinValueInArray {
    public static void main(String[] args) {
        int[] nums = {3,2,7,4,6,8,9,5,11};
        int minValueByAlg = findMinValueByAlg(nums);
        System.out.println("minValueByAlg = " + minValueByAlg);
        int minValueByStream = findMinValueByStream(nums);
        System.out.println("minValueByStream = " + minValueByStream);

    }

    private static int findMinValueByStream(int[] nums) {
        return Arrays.stream(nums).min().getAsInt();
    }

    private static int findMinValueByAlg(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]<min){
                min = nums[i];
            }
        }
        return min;
    }
}
