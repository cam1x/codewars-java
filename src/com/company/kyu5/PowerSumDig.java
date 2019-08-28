package com.company.kyu5;

import java.util.*;
import java.util.stream.Stream;

/*
    Condition: https://www.codewars.com/kata/55f4e56315a375c1ed000159
 */

public class PowerSumDig {

    private static final int MAX_POWER = 50;
    private static final long MAX_NUMBER_TO_CHECK = 500;

    public static long powerSumDigTerm(int n) {
        List<Long> resultList = new ArrayList<>();
        for (int i = 2; i < MAX_NUMBER_TO_CHECK; i++) {
            for (int j = 2; j < MAX_POWER; j++) {
                long product = (long) Math.pow(i, j);
                if (sumOfDigits(product) == i) {
                    resultList.add(product);
                }
            }
        }
        Collections.sort(resultList);
        return resultList.get(n - 1);
    }

    private static long sumOfDigits(long n){
        return Stream.of(Long.toString(n).split(""))
                .mapToInt(x->Integer.parseInt(x))
                .sum();
    }
}
