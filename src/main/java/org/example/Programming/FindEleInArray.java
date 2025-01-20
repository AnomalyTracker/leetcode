package org.example.leetcode;

import java.util.Arrays;

public class FindEleInArray {
    public static void main(String[] args) {
        int[] a = {2,5,0,1,6,8,9};
        int target = 5;
        int index = findElement(a,target);
        if(index>=0){
            System.out.println(target+" is in index "+ index);
        }
        else
            System.out.println(target+" is not found in given array");
    }

    private static int findElement(int[] a, int target) {
        int start = 0;
        int end = a.length-1;
        while (start<=end){
            int mid = start+((end-start)/2);
            if(a[mid]==target){
                return mid;
            } else if (a[start]<=a[mid]){
                if (a[start]<=target && target<a[mid]) {
                    end = mid - 1;
                }
                else
                    start = mid+1;
            }
            else{
                if ((a[mid]<target && target <=a[end])){
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
