package com.company.kyu61;

/*
    Condition: https://www.codewars.com/kata/56e23f98bf8f6e9aed000367
 */

public class StringCombat {
    private static final String LIFE = " abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String combat(String s1, String s2) {

        if (s1 == null) s1 = "";
        if (s2 == null) s2 = "";

        if (s1.isEmpty() || s2.isEmpty()) {
            return s1.isEmpty() ? (s2.isEmpty() ? "Draw" : "Winner: s2("+s2+")") : "Winner: s1("+s1+")";
        }

        final char ch1 = s1.charAt(0), ch2 = s2.charAt(0);
        final double s1Life = LIFE.indexOf(ch1), s2Life = LIFE.indexOf(ch2);

        // Battle
        return
                (s1Life < s2Life) ? combat(s1.substring(1), LIFE.charAt((int)(s2Life/3.0+0.5)) + s2.substring(1)) :
                        (s1Life > s2Life) ? combat(LIFE.charAt((int)(s1Life/3.0+0.5)) + s1.substring(1), s2.substring(1)) :
                                combat(s1.substring(1), s2.substring(1));
    }
}