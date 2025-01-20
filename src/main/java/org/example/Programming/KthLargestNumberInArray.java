package org.example.leetcode;

import javafx.print.Collation;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargestNumberInArray {
    static Scanner sc = new Scanner((System.in));
    public static void main(String[] args) {
        int[] arr= {3,2,1,5,6,4,7};
        System.out.println("Enter Kth value: ");
        int k = sc.nextInt();
        int kthLargest = findKthLargest(arr, k);
        System.out.println("kthLargest = " + kthLargest);
    }

    private static int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        for (int i = 0; i < k-1; i++) {
            pq.poll();
        }
        return pq.peek();
    }
}
