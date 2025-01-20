package org.example.array;

import java.util.Arrays;

public class SecondMaxValueInArray {
    public static void main(String[] args) {
        int[] nums = {3,2,7,4,6,8,9,5,11};
        int secondMaxVal = Arrays.stream(nums).sorted().skip(nums.length -2).findFirst().getAsInt();
        System.out.println("secondMaxVal = " + secondMaxVal);
    }
}
