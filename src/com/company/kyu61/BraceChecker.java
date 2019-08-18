package com.company.kyu61;

/*
    Condition: https://www.codewars.com/kata/5277c8a221e209d3f6000b56
 */

import java.util.*;

public class BraceChecker {

    public boolean isValid(String braces) {
        Deque<Character> open = new LinkedList<>();

        for(int i = 0; i < braces.length(); i++) {
            char current = braces.charAt(i);
            char openBrace = getOpenBrace(current);

            if(openBrace == 0) {
                open.push(current);
            }
            else {
                if (open.isEmpty() || open.pop() != openBrace) {
                    return false;
                }
            }
        }
        return open.isEmpty();
    }

    public char getOpenBrace(char closeBrace) {
        switch(closeBrace) {
            case ')': return '(';
            case ']': return '[';
            case '}': return '{';
        }
        return 0;
    }
}
