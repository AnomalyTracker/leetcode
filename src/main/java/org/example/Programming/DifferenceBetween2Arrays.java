package org.example.leetcode;

import java.util.*;

public class DifferenceBetween2Arrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4,6};
        List<List<Integer>> differenceInArrays = getDifferenceInArrays(nums1, nums2);
        System.out.println("differenceInArrays = " + differenceInArrays);
    }

    private static List<List<Integer>> getDifferenceInArrays(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (Integer num : nums1){
            set1.add(num);
        }
        for (Integer num: nums2){
            set2.add(num);
        }
        Set<Integer> removedNums1 = new HashSet<>();
        for (int num : nums2){
            if (!set1.contains(num)){
                removedNums1.add(num);
            }
        }
        Set<Integer> removedNums2 = new HashSet<>();
        for (int num : nums1){
            if (!set2.contains(num)){
                removedNums2.add(num);
            }
        }
        return Arrays.asList(new ArrayList<>(removedNums2), new ArrayList<>(removedNums1));
    }
}
