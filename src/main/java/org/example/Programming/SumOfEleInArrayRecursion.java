package org.example.leetcode;

import java.util.Arrays;

public class SumOfEleInArrayRecursion {

    static int[] num = {1,2,3,4,5,6,7,8,9,10};
    public static void main(String[] args) {

        //using java8
        System.out.println("Using Java 8");
        int sum = Arrays.stream(num).sum();
        System.out.println("sum of elements in the array using java8 is = " + sum);
        System.out.println("===============================");
        System.out.println("Using recursion process");
        int indexToAdd = num.length-1;
        int sumByRecursion = addRecursion(indexToAdd);
        System.out.println("sum of elements in the array using recursion method is ="+ sumByRecursion);
    }


    private static int addRecursion(int index) {
        if (index == 0){
            return num[0];
        }
        return num[index]+addRecursion(index-1);
    }
}
