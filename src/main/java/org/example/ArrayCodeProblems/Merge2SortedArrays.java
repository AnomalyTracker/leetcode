package org.example.leetcode.ArrayCodeProblems;

import java.util.Arrays;

public class Merge2SortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {};
        int[] nums2 = {};
        int m = nums1.length;
        int n = nums2.length;
        mergeArrays(nums1,nums2,m,n);
        System.out.println("Merged Array: "+ Arrays.toString(nums1));
    }

    private static void mergeArrays(int[] nums1, int[] nums2, int m, int n) {
        int k = m+n;
        int[] temp = new int[k];
        int left =m-1;
        int right = n-1;
        while(left>=0 && right>=0){
            if(nums1[left]<nums2[right]){
                temp[k-1]=nums2[right];
                right--;
                k--;
            }
            else{
                temp[k-1]=nums1[left];
                k--;
                left--;
            }
        }
    }
}
