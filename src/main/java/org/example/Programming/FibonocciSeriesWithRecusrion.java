package org.example.leetcode;

public class FibonocciSeriesWithRecusrion {
    static int n1 =0, n2 = 1;
    public static void main(String[] args) {
        int count = 10;

        System.out.print(n1+", "+n2);
        addNextFibonocciNumber(count-2);
    }

    private static void addNextFibonocciNumber(int i) {
        int n3 =0;
        if (i>0){
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.print(", "+n3);
            addNextFibonocciNumber(i-1);
        }
    }
}
