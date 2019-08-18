package com.company.kyu6;

/*
    Condition: https://www.codewars.com/kata/526571aae218b8ee490006f4
 */

public class BitCounting {

    public static int countBits(int n){
        int bits=0;
        while(n>0){
            if(n%2==1){
                bits++;
            }
            n>>=1;
        }
        return bits;
    }
}
