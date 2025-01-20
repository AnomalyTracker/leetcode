package org.example.leetcode;

import java.util.Arrays;

public class EqualRowColumnPair {
    public static void main(String[] args) {
        int[][] nums = {{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
        int equalRowColumnPair = findequalRowColumnPair(nums);
        System.out.println("equalRowColumnPair = " + equalRowColumnPair);
    }

    private static int findequalRowColumnPair(int[][] nums) {
        int[] rowsNums = new int[nums.length];
        int prod = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                prod = prod*10+nums[i][j];
            }
            rowsNums[i]=prod;
            prod = 0;
        }
        System.out.println(Arrays.toString(rowsNums));
        int[] columnsNums = new int[nums[0].length];
        for (int i = 0; i < nums[0].length; i++) {
            for (int j = 0; j < nums.length; j++) {
                prod = prod*10+nums[j][i];
            }
            columnsNums[i]=prod;
            prod = 0;
        }
        System.out.println(Arrays.toString(columnsNums));
        int count=0;
        for (int i = 0; i < rowsNums.length; i++) {
            for (int j = 0; j < columnsNums.length; j++) {
                if (rowsNums[i]==columnsNums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
