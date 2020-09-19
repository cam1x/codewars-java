package com.company.kyu6;

/*
    Condition: https://www.codewars.com/kata/545cedaa9943f7fe7b000048
 */

public class PangramChecker {
    public boolean check(String sentence) {
        for (char c = 'a'; c <= 'z'; c++) {
            if (!sentence.toLowerCase().contains("" + c)) {
                return false;
            }
        }
        return true;
    }
}
