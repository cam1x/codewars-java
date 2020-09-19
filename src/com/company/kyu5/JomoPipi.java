package com.company.kyu5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/*
    Condition: https://www.codewars.com/kata/5ae43ed6252e666a6b0000a4
 */

public class JomoPipi {
    public static String jumbledString(String s, long n) {
        StringBuilder sb = new StringBuilder(s);
        List<String> list = new ArrayList<>();
        final int[] indexes = IntStream.concat(IntStream.range(0, s.length() / 2 + s.length() % 2).map(x -> x * 2),
                IntStream.range(1, s.length() / 2 + 1).map(x -> x * 2 - 1)).toArray();
        String string = s;

        long i = -1;
        while (i == -1 || !string.equals(s)) {
            if (++i == n) {
                return s;
            }
            list.add(s);
            for (int j = 0; j < indexes.length; j++) {
                sb.setCharAt(j, s.charAt(indexes[j]));
            }
            s = sb.toString();
        }

        return list.get((int) (n % ++i));
    }

    public static void main(String[] args) {
        String word = "abcdef";
        System.out.println(word.length());
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + "\t" + jumbledString(word, i));
        }
    }
}
