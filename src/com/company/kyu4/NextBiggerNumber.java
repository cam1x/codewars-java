package com.company.kyu4;

import java.util.*;

/*
    Condition: https://www.codewars.com/kata/55983863da40caa2c900004e
 */

public class NextBiggerNumber {

    public static long nextBiggerNumber(long n) {
        char [] digits = String.valueOf(n).toCharArray();
        for(int i = digits.length - 2; i >= 0; i--){
            for (int j = digits.length-1; j > i; j--){
                if(digits[i] < digits[j]){
                    char temp = digits[i];
                    digits[i] = digits[j];
                    digits[j] = temp;
                    Arrays.sort(digits, i+1, digits.length);
                    return Long.valueOf(String.valueOf(digits));
                }
            }
        }
        return -1;
    }
}
