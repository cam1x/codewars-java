package com.company.kyu6;

import java.util.Arrays;

/*
    Condition: https://www.codewars.com/kata/tribonacci-sequence
 */

public class Tribonacci {

    public static double[] tribonacci(double[] s, int n) {
        if (n < 0) {
            return null;
        }

        double[] result=Arrays.copyOf(s,n);
        for (int i=s.length;i<n;i++){
            result[i]=result[i-1]+result[i-2]+result[i-3];
        }
        return result;
    }
}
