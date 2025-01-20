package org.example.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class KthLargestElementInArray {
    static Scanner sc = new Scanner((System.in));
    public static void main(String[] args) {
        int[] arr= {3,2,1,5,6,4,7};
        System.out.println("Enter Kth value: ");
        int k = sc.nextInt();
        int kthLargestValue = findKthLargestValue(arr,k);
        System.out.println("kthLargestValue = " + kthLargestValue);
    }

    private static int findKthLargestValue(int[] arr, int k) {
        Arrays.sort(arr);
        
        return arr[arr.length-k];
    }
}
