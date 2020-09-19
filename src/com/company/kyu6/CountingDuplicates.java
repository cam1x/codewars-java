package com.company.kyu6;

/*
    Condition: https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1
 */

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        java.util.ArrayList<Character> duplicateLetters = new java.util.ArrayList<>();
        java.util.List<Character> arr = java.util.Arrays.asList(
                text.toLowerCase().chars()
                        .mapToObj(ch -> (char) ch)
                        .toArray(Character[]::new));
        for (char ch : text.toCharArray()) {
            if (java.util.Collections.frequency(arr, ch) > 1) {
                if (!duplicateLetters.contains(ch)) {
                    duplicateLetters.add(ch);
                }
            }
        }
        return duplicateLetters.size();
    }
}