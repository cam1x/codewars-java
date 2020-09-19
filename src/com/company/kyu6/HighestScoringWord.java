package com.company.kyu6;

/*
    Condition: https://www.codewars.com/kata/57eb8fcdf670e99d9b000272
 */

public class HighestScoringWord {
    public static int score(String word) {
        int score = 0;
        for (int i = 0; i < word.length(); i++) {
            score += word.charAt(i) - 96;
        }
        return score;
    }

    public static String high(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }
        String[] words = s.split(" ");
        int indexOfMax = 0;
        for (int i = 0; i < words.length; i++) {
            if (score(words[indexOfMax]) < score(words[i])) {
                indexOfMax = i;
            }
        }
        return words[indexOfMax];
    }
}
