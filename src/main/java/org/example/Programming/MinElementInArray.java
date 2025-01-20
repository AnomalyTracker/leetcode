package org.example.leetcode;

import java.util.Arrays;

public class MinElementInArray {
    public static void main(String[] args) {
        int[] a = {4,2,7,8,10};
        System.out.println(findMinValue(a));
        System.out.println(findMaxValue(a));
    }

    private static int findMaxValue(int[] a) {
        return Arrays.stream(a).max().getAsInt();
    }

    private static int findMinValue(int[] a) {
        return Arrays.stream(a).min().getAsInt();
    }
}
