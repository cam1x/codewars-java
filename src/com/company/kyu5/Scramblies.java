package com.company.kyu5;

/*
    Condition: https://www.codewars.com/kata/55c04b4cc56a697bb0000048
 */

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        StringBuilder sb = new StringBuilder(str1);
        for (int i = 0; i < str2.length(); i++) {
            if (sb.indexOf(str2.charAt(i) + "") == -1) {
                return false;
            }
            sb.deleteCharAt(sb.indexOf(str2.charAt(i) + ""));
        }
        return true;
    }
}
