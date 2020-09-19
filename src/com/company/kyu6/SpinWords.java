package com.company.kyu6;

/*
    Condition: https://www.codewars.com/kata/5264d2b162488dc400000001
 */

public class SpinWords {
    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder string = new StringBuilder();
        StringBuilder str;

        for (String word : words) {
            if (word.length() >= 5) {
                str = new StringBuilder(word);
                string.append(str.reverse().toString()).append(" ");
            } else {
                string.append(word).append(" ");
            }
        }
        return string.substring(0, string.length() - 1);
    }
}
