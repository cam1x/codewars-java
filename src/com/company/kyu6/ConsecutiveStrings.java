package com.company.kyu6;

/*
    Condition: https://www.codewars.com/kata/56a5d994ac971f1ac500003e
 */

public class ConsecutiveStrings {
    public static String longestConsec(String[] strarr, int k) {
        if (k > strarr.length || k <= 0) {
            return "";
        }

        int startIndex = 0;
        int currLength;
        int maxLength = 0;
        for (int i = 0; i <= strarr.length - k; i++) {
            currLength = 0;
            for (int j = i; j < i + k; j++) {
                currLength += strarr[j].length();
            }
            if (maxLength < currLength) {
                maxLength = currLength;
                startIndex = i;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = startIndex; i < startIndex + k; i++) {
            result.append(strarr[i]);
        }

        return result.toString();
    }
}
