package org.example.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestNumberInArray {
    public static void main(String[] args) {
        int[] nums = {5,9,11,2,8,21,1};
        Integer secondHighestNumber = Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("secondHighestNumber = " + secondHighestNumber);
        
        //find second Lowest Number
        Integer secondLowestNumber = Arrays.stream(nums).boxed().sorted().skip(1).findFirst().get();
        System.out.println("secondLowestNumber = " + secondLowestNumber);
    }
}
