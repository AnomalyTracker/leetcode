package org.example.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfEvenNumbersInArrayJava8 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int sum = Arrays.stream(nums).filter(n -> n%2==0).sum();
        System.out.println("Sum of even numbers in the given Array is : "+sum);
    }
}
