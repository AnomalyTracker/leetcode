package org.example.leetcode;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        int[] flowerBed = {1,0,1};
        int n = 3;
        Boolean canPlaceFlower = CheckcanPlaceFlower(flowerBed, n);
        System.out.println("canPlaceFlower = " + canPlaceFlower);
    }

    private static Boolean CheckcanPlaceFlower(int[] flowerBed, int n) {
        int count=0;
        if(n==0){
            return true;
        }
        for (int i = 0; i < flowerBed.length; i++) {
            if(i==0 && flowerBed[i]==0 && flowerBed[i+1]==0){
                flowerBed[i]=1;
                count++;
                if (count == n){
                    return true;
                }
            } else if (i==flowerBed.length-1 && flowerBed[i]==0 && flowerBed[i-1]==0) {
                flowerBed[i]=1;
                count++;
                if (count==n){
                    return true;
                }else
                    return false;
            }else if (flowerBed[i] == 0 && flowerBed[i+1] == 0 && flowerBed[i-1]==0){
                flowerBed[i]=1;
                count++;
                if (count == n){
                    return true;
                }
            }
        }
        return false;
    }
}
