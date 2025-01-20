package org.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroids = {5,10,-5};
        int[] resultantAsteroids = moveAsteroids(asteroids);
        System.out.println("resultantAsteroids : "+ Arrays.toString(resultantAsteroids));
    }

    private static int[] moveAsteroids(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids){
            while (!stack.isEmpty() && asteroid<0 && stack.peek()>0){
                if (Math.abs(asteroid)>stack.peek()){
                    stack.pop();
                } else if (Math.abs(asteroid)==stack.peek()) {
                    stack.pop();
                    asteroid =0;
                }else
                    asteroid=0;
            }
            if (asteroid!=0){
                stack.push(asteroid);
            }
        }
        int[] resultArrAsteroids = new int[stack.size()];
        for (int i = 0; i < resultArrAsteroids.length ; i++) {
            resultArrAsteroids[i] = stack.get(i);
        }
        return resultArrAsteroids;
    }
}
