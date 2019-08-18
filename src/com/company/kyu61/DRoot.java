package com.company.kyu61;

/*
    Condition: https://www.codewars.com/kata/541c8630095125aba6000c00
 */

public class DRoot {
    public static int sumOfDigits(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }

    public static int digital_root(int n) {
        while(n>10){
            n=sumOfDigits(n);
        }
        return n;
    }
}