package org.example.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ElementsStartWith1InArray {
    public static void main(String[] args) {
        int[] nums = {5,9,11,2,8,21,1};
        List<String> NumsStartwith1 = Arrays.stream(nums).boxed().map(s -> s + "").filter(s -> s.startsWith("1")).collect(Collectors.toList());
        System.out.println("NumsStartwith1 = " + NumsStartwith1);
    }
}
