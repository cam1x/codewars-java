package com.company.kyu5;

/*
    Condition: https://www.codewars.com/kata/520b9d2ad5c005041100000f
 */

public class PigLatin {

    public static String pigIt(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
}
