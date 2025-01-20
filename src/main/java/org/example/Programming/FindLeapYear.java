package org.example.leetcode;

import java.time.Year;
import java.util.stream.IntStream;

public class FindLeapYear {
    public static void main(String[] args) {
        //int year = 1999;
        int[] years = IntStream.rangeClosed(1000,2000).toArray();
        for (int year : years){
            Year y = Year.of(year);
            if (y.isLeap()){
                System.out.println(year+" is leap year");
            }

        }
    }
}
