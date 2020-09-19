package com.company.kyu5;

/*
    Condition: https://www.codewars.com/kata/54d7660d2daf68c619000d95
 */

public class Fracts {
    public static String convertFrac(long[][] lst) {
        if (lst == null || lst.length == 0) {
            return "";
        }
        normalize(lst);
        long commonDenominator = leastCommonMultiply(lst);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lst.length; i++) {
            lst[i][0] *= (double) commonDenominator / lst[i][1];
            lst[i][1] = commonDenominator;
            sb.append("(" + lst[i][0] + "," + lst[i][1] + ")");
        }
        return sb.toString();
    }

    public static long leastCommonMultiply(long[][] array) {
        long nok = array[0][1];
        for (int i = 1; i < array.length; i++) {
            nok = (nok * array[i][1]) / greatestCommonDevision(nok, array[i][1]);
        }
        return nok;
    }

    public static long greatestCommonDevision(long firstNum, long secondNum) {
        if (secondNum == 0) {
            return Math.abs(firstNum);
        } else {
            return greatestCommonDevision(secondNum, firstNum % secondNum);
        }
    }

    public static void normalize(long[][] lst) {
        for (int i = 0; i < lst.length; i++) {
            for (long j = Math.min(lst[i][0], lst[i][1]); j > 1; j--) {
                if (lst[i][0] % j == 0 && lst[i][1] % j == 0) {
                    lst[i][0] /= j;
                    lst[i][1] /= j;
                }
            }
        }
    }
}
