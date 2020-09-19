package com.company.kyu6;

/*
    Condition: https://www.codewars.com/kata/5a9c35e9ba1bb5c54a0001ac
 */

public class SumOfTwo {
    public static int add(int x, int y) {
        if (y == 0) return x;
        int t = x ^ y;
        int carry = (x & y) << 1;
        return add(t, carry);
    }
}
