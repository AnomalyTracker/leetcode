package org.example.array;

import java.util.Arrays;

public class RemoveEvenFromArray {
    public static void main(String[] args) {
        int[] nums = {3,2,7,4,6,8,9,5,7};
        int[] removedEvenArray = removeEvenByNormal(nums);
        System.out.println(Arrays.toString(removedEvenArray));
        int[] oddArray = removeEvenByFiltering(nums);
        System.out.println(Arrays.toString(oddArray));
    }

    private static int[] removeEvenByFiltering(int[] nums) {
        int[] resultArray = Arrays.stream(nums).filter(x->x%2!=0).toArray();
        return resultArray;
    }

    private static int[] removeEvenByNormal(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2 !=0){
                count++;
            }
        }
        int[] resultNum  = new int[count];
        int oddCount=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2!=0){
                resultNum[oddCount]=nums[i];
                oddCount++;
            }
        }
        return resultNum;
    }
}
