package com.company.kyu5;

/*
    Condition: https://www.codewars.com/kata/52f787eb172a8b4ae1000a34
 */

public class TrailingZeros {
    public static int zeros(int n) {
        return getSum(n, 1);
    }

    public static int getSum(int n, int pow) {
        int nextNum = (int) Math.pow(5, pow);
        if (nextNum > n) {
            return 0;
        }
        return (n / nextNum) + getSum(n, ++pow);
    }
}
