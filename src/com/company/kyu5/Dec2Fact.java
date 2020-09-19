package com.company.kyu5;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
    Condition: https://www.codewars.com/kata/54e320dcebe1e583250008fd
 */

public class Dec2Fact {
    private static final Map<Character, Integer> mapKeys = new HashMap<>();

    static {
        for (char i = '0'; i <= '9'; i++) {
            mapKeys.put(i, Integer.parseInt(String.valueOf(i)));
        }
        for (char i = 'A'; i < 'Z'; i++) {
            mapKeys.put(i, i - 55);
        }
    }

    public static String dec2FactString(long nb) {
        StringBuilder result = new StringBuilder();
        Stack<Long> stack = new Stack<>();
        long i = 0;
        while (true) {
            long base = factorial(i);
            if (base > nb) {
                break;
            }
            stack.push(base);
            i++;
        }
        long temp = nb;
        while (!stack.empty()) {
            long multiply = temp / stack.peek();
            temp -= multiply * stack.pop();
            result.append(multiply > 9 ? Character.toString((char) ('A' + multiply - 10)) : multiply);
        }
        return result.toString();
    }

    public static long factString2Dec(String str) {
        StringBuilder stringBuilder = new StringBuilder(str).reverse();
        long result = 0, fact = 1;
        for (int i = 1; i < stringBuilder.length(); i++) {
            fact *= i;
            result += fact * mapKeys.get(stringBuilder.charAt(i));
        }
        return result;
    }

    private static long factorial(long n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}