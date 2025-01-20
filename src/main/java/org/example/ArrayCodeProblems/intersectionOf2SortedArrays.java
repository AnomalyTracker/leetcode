package org.example.leetcode.ArrayCodeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intersectionOf2SortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,3,3,4,5,6,7};
        int[] nums2 = {2,3,3,4,5,5,6};
        List<Integer> intersectedArray = findIntersection(nums1,nums2);
        System.out.println("Arrays.toString(intersectedArray) = " + intersectedArray);
    }

    private static List<Integer> findIntersection(int[] nums1, int[] nums2) {
        List<Integer> intersectedNums = new ArrayList<>();
        int i = 0,j=0;
        while(i<nums1.length && j< nums2.length){
            if(nums1[i]==nums2[j]){
                intersectedNums.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i]<nums2[j]) {
                i++;
            }else 
                j++;
        }
        return intersectedNums;
    }
}
