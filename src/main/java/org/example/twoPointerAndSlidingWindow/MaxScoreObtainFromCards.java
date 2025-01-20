package org.example.leetcode.twoPointerAndSlidingWindow;

public class MaxScoreObtainFromCards {
    public static void main(String[] args) {
        int[] cardPoints = {1,2,3,4,5,6,1};
        int k= 4;
        int maxScore = findMaxScoreObtainFromCards(cardPoints,4);
        System.out.println("maxScore = " + maxScore);
    }

    private static int findMaxScoreObtainFromCards(int[] cardPoints, int k) {
        int leftSum = 0;
        int rightSum = 0;
        int maxSum=0;
        int rIndex= cardPoints.length-1;
        for (int i = 0; i < k; i++) {
            leftSum = leftSum+cardPoints[i];
        }

        maxSum=leftSum;
        for (int i = k-1; i >=0 ; i--) {
            leftSum=leftSum-cardPoints[i];

            rightSum = rightSum+cardPoints[rIndex];

            maxSum = Math.max(maxSum, leftSum+rightSum);
            
            rIndex--;
        }
        return maxSum;
    }
}
