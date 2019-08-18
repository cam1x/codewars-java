package com.company.kyu6;

import java.util.Arrays;

/*
    Condition: https://www.codewars.com/kata/556e0fccc392c527f20000c5
 */

public class Xbonacci {

    public double[] xbonacci(double[] signature, int n) {
        if (n < 0) {
            return null;
        }
        double[] result= Arrays.copyOf(signature,n);
        for (int i=signature.length;i<n;i++){
            for (int j=1;j<=signature.length;j++){
                result[i]+=result[i-j];
            }
        }
        return result;
    }
}
