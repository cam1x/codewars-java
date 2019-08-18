package com.company.kyu6;

/*
    Condition: https://www.codewars.com/kata/59f44c7bd4b36946fd000052
 */

class Hist {
    private static String err(String s, char c) {
        s = s.replace(c,'*').replaceAll("[^*]","");
        if (!s.isEmpty()) s = String.format("%c  %-6d%s\r", c, s.length(), s);
        return s;
    }

    public static String hist(String s) {
        return (err(s,'u') + err(s,'w') + err(s,'x') + err(s,'z')).trim();
    }
}
