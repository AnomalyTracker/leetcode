package org.example.leetcode.ArrayCodeProblems;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElementInArray {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 4;
        int kthLargest = findKthLargestNum(nums,k);
        System.out.println("kthLargest = " + kthLargest);
    }

    private static int findKthLargestNum(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (Integer num : nums){
            priorityQueue.add(num);
        }

        for (int i = 0; i < k-1; i++) {
            priorityQueue.poll();
        }
        return priorityQueue.peek();
    }
}
