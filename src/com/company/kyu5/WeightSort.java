package com.company.kyu5;

import java.util.*;
import java.util.stream.*;

/*
    Condition: https://www.codewars.com/kata/55c6126177c9441a570000cc
 */

public class WeightSort {

    public static String orderWeight(String strng) {
        return  Arrays.stream(strng.split("\\s+"))
                .sorted(Comparator
                        .comparing(WeightSort::sumOfDigits)
                        .thenComparing(String::compareTo))
                .collect(Collectors.joining(" "));
    }

    public static int sumOfDigits(String str){
        return str.chars().map(c -> c - 48).sum();
    }
}