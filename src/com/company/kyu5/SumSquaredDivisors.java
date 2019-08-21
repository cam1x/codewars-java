package com.company.kyu5;

import java.util.*;

/*
    Condition: https://www.codewars.com/kata/55aa075506463dac6600010d
 */

public class SumSquaredDivisors {

    public static String listSquared(long m, long n) {
        List<String> numbers=new ArrayList<>();
        for (long i=m;i<n;i++){
            long sum=getSum(i);
            if (sum>0 && isSquared(sum)){
                numbers.add("["+i+", "+sum+"]");
            }
        }
        return "["+String.join(", ",numbers)+"]";
    }

    private static long getSum(long n){
        long sum=0;
        for (int i=1;i<=n;i++){
            if (n%i==0){
                sum+=i*i;
            }
        }
        return sum;
    }

    private static boolean isSquared(long n){
        return Math.sqrt(n)%1==0;
    }
}
