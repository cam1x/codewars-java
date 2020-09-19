package com.company.kyu5;

import java.util.Arrays;
import java.util.Comparator;

/*
    Condition: https://www.codewars.com/kata/56f4ff45af5b1f8cd100067d
 */

public class Dinglemouse {
    private static String[] UNITS = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static String[] TENS = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static int[] sort(final int[] array) {
        return Arrays.stream(array)
                .boxed()
                .sorted(Comparator.comparing(Dinglemouse::toName))
                .map(String::valueOf)
                .mapToInt(Integer::valueOf)
                .toArray();
    }

    private static String toName(int i) {
        return (i == 0) ? "zero" : getName((i / 100) % 10, " hundred") + ((i / 100) % 10 != 0 ? " " : "") + getName(i % 100);
    }

    private static String getName(int i, String toAppend) {
        return getName(i) + ((i > 0) ? toAppend : "");
    }

    private static String getName(int i) {
        return i > 19 ? TENS[i / 10] + " " + UNITS[i % 10] : UNITS[i];
    }
}
