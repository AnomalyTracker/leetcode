package org.example.leetcode.ArrayCodeProblems;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] nums ={1,2,3};
        List<List<Integer>> permutations = findAllPermutations(nums);
        System.out.println(permutations.toString());
    }

    private static List<List<Integer>> findAllPermutations(int[] nums) {
         List<List<Integer>> resultPermutations = new ArrayList<>();
         retriveTheNums(resultPermutations, new ArrayList<Integer>(), nums);
         return resultPermutations;
    }

    private static void retriveTheNums(List<List<Integer>> resultPermutations, ArrayList<Integer> tempNumsList, int[] nums) {
        if (tempNumsList.size()== nums.length){
            resultPermutations.add(new ArrayList<>(tempNumsList));
            return;
        }
        for (int num: nums){
            if (tempNumsList.contains(num)){
                continue;
            }
            tempNumsList.add(num);
            retriveTheNums(resultPermutations, tempNumsList, nums);
            tempNumsList.remove(tempNumsList.size() -1);
        }
    }

}
