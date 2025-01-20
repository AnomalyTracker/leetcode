package org.example.array;

import java.util.Arrays;
import java.util.Hashtable;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 2,7,11,15};
        int[] indexs =  twoSum(nums, 9);
        System.out.println("indexs.toString() = " + Arrays.toString(indexs));
    }


    private static int[] twoSum(int[] nums, int target) {
        Hashtable<Integer, Integer> table = new Hashtable<>();
        for (int i = 0; i < nums.length; i++) {
            int secondNum = target - nums[i];
            if (table.containsKey(secondNum)){
                return new int[]{ table.get(secondNum),i};
            }
            table.put(nums[i],i);
        }
        return new int[0];

    }
}
