package org.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class KidsWiththeGreatestNumberofCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> list = checkKidHasGreatestCandies(candies,extraCandies);
        System.out.println("list = " + list);

    }

    private static List<Boolean> checkKidHasGreatestCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        for (int value : candies){
            list.add(value+extraCandies>= max);
        }
        return list;
    }
}
