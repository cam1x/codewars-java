package com.company.kyu6;

/*
    Condition: https://www.codewars.com/kata/build-a-pile-of-cubes/train/java
 */

public class ASum {

    public static long findNb(long m) {
        long res=1;
        while(Math.pow(res,3)<m){
            m-=Math.pow(res,3);
            res++;
        }
        return (Math.pow(res,3)==m)?res:-1;
    }
}
