package org.example.leetcode.ArrayCodeProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] nums = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> leaders = getAllLeaderOfArray(nums);
        Collections.sort(leaders, Collections.reverseOrder());
        System.out.println("leaders = " + leaders);
    }

    private static ArrayList<Integer> getAllLeaderOfArray(int[] nums) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int leader = nums[nums.length-1];
        for (int i = nums.length-1; i >=0 ; i--) {
            if(nums[i]>=leader){
                leader = nums[i];
                leaders.add(leader);
            }
        }
        return leaders;
    }
}
