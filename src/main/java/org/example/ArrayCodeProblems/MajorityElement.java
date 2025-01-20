package org.example.leetcode.ArrayCodeProblems;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int majorityNum = findMajorityElement(nums);
        System.out.println("num = " + majorityNum);
    }

    private static int findMajorityElement(int[] nums) {
//        Map<Integer, Integer> freMap = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            freMap.put(nums[i],freMap.getOrDefault(nums[i],0)+1);
//        }
//        for (Map.Entry<Integer, Integer> entry : freMap.entrySet()) {
//            if(entry.getValue()>nums.length/2){
//                return entry.getKey();
//            }
//        }
//        return -1;

        int majority = 0;
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            if(count==0){
                majority=nums[i];
                count++;
            }else if(nums[i]==majority){
                count++;
            }else
                count--;
        }
        int counter=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==majority){
                counter++;
            }
        }
        if(counter > nums.length/2){
            return majority;
        }
        return -1;
    }

}
