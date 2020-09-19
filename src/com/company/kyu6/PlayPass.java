package com.company.kyu6;

/*
    Condition: https://www.codewars.com/kata/559536379512a64472000053
 */

public class PlayPass {
    public static String playPass(String s, int n) {
        StringBuilder sb = new StringBuilder();
        char current;
        for (int i = 0; i < s.length(); i++) {
            current = s.charAt(i);
            if (Character.isAlphabetic(current)) {
                if (i % 2 == 0) {
                    current = Character.toUpperCase(current);
                    sb.append((char) ((current + n - 65) % 26 + 65));
                } else {
                    current = Character.toLowerCase(current);
                    sb.append((char) ((current + n - 97) % 26 + 97));
                }
            } else {
                if (Character.isDigit(current)) {
                    sb.append(9 - Integer.parseInt(current + ""));
                } else {
                    sb.append(current);
                }
            }
        }
        return sb.reverse().toString();
    }
}
