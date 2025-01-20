package org.example.leetcode;

import java.util.Scanner;

public class FactorialByRecursion {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the Number to find factorial");
        int num = sc.nextInt();
        int factorial = findFactorial(num);
        System.out.println("Factorial for the given number is "+factorial);
    }

    private static int findFactorial(int num) {
        if(num==1){
            return 1;
        }
        return num*findFactorial(num-1);
    }
}
