package org.example.leetcode;

import java.util.Scanner;

public class MaximumAverageSubArray {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {1,12,-5,-6,50,3};
        System.out.println("Enter K value");
        int k = sc.nextInt();
        double maxAverage = findMaxAverageSubArray(arr, k);
        System.out.println("maxAverage = " + maxAverage);
    }

    private static double findMaxAverageSubArray(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum+= arr[i];
        }

        int maxSum = sum;
        for (int i = k; i < arr.length; i++) {
            sum+= arr[i]- arr[i-k];
            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum /k;
    }
}
