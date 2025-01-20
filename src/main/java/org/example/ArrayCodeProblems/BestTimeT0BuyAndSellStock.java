package org.example.leetcode.ArrayCodeProblems;

public class BestTimeT0BuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int profit = findMaxProfitDuringBuyAndSell(prices);
        System.out.println("profit = " + profit);
    }

    private static int findMaxProfitDuringBuyAndSell(int[] prices) {
        int profit=0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            int cost = prices[i]-min;
            profit = Math.max(profit, cost);
            min = Math.min(prices[i],min);
        }
        return profit;
    }
}
