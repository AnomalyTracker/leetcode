package org.example.leetcode;

public class HighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        int largestAlt = findHighestAltitude(gain);
        System.out.println("largestAlt = " + largestAlt);
    }

    private static int findHighestAltitude(int[] gain) {
        int initialAlt = 0;
        int maxAlt = initialAlt;
        for (int i = 0; i < gain.length; i++) {
            initialAlt += gain[i];
            maxAlt = Math.max(maxAlt, initialAlt);
        }
        return maxAlt;
    }
}
