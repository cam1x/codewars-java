package com.company.kyu5;

/*
    Condition: https://www.codewars.com/kata/59e625bf3d09a7471d00020e
 */

public class Fibonacci {
    public static java.util.stream.IntStream stream(int a, int b) {
        return java.util.stream.Stream.iterate(new int[]{a, b},
                i -> new int[]{i[1], i[0] + i[1]})
                .mapToInt(i -> i[0]);
    }
}