package com.company.kyu5;

/*
    Condition: https://www.codewars.com/kata/551dd1f424b7a4cdae0001f0
 */

public class Line {
    public static String WhoIsNext(String[] names, int n) {
        int numOfClons = 1;
        while (names.length * numOfClons < n) {
            n -= numOfClons * names.length;
            numOfClons *= 2;
        }
        return names[(n - 1) / numOfClons];
    }
}
