package com.company.kyu61;

import java.util.*;

/*
    Condition: https://www.codewars.com/kata/5626b561280a42ecc50000d1
 */

public class SumDigPower {

    public static boolean isCorrect(long num){
        long res=0;
        long time = Long.parseLong(new StringBuilder(Long.toString(num)).reverse().toString());
        int power=1;
        while (time>0){
            res+=Math.pow(time%10,power);
            power++;
            time/=10;
        }
        return res==num;
    }

    public static List<Long> sumDigPow(long a, long b) {
        List<Long> list = new ArrayList<>();
        for (long i=a;i<=b;i++){
           if (isCorrect(i)){
               list.add(i);
           }
        }
       return list;
    }

    public static void main(String[] args) {
        System.out.println(sumDigPow(1,10));
    }
}
