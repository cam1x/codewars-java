package com.company.kyu61;

/*
    Condition: https://www.codewars.com/kata/5552101f47fc5178b1000050
 */

public class DigPow {
    public static int getNumOfDigits(int num){
        int digits=0;
        while(num>0){
            digits++;
            num/=10;
        }
        return digits;
    }

    public static long digPow(int n, int p) {
        int numOfDigits=getNumOfDigits(n);
        int res=0;
        int time=n;
        for(int i=0;i<numOfDigits;i++){
            res+=Math.pow(time%10 ,(numOfDigits-1+p-i));
            time/=10;
        }
        return (res%n==0)?res/n:-1;
    }
}