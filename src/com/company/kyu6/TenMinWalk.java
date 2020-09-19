package com.company.kyu6;

/*
    Condition: https://www.codewars.com/kata/54da539698b8a2ad76000228
 */

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }

        int northSouthPosition = 0;
        int westEastPosition = 0;

        for (char direction : walk) {
            switch (direction) {
                case 'n' -> northSouthPosition++;
                case 'e' -> westEastPosition++;
                case 's' -> northSouthPosition--;
                case 'w' -> westEastPosition--;
                default -> throw new IllegalStateException("Unknown direction: " + direction);
            }
        }

        return northSouthPosition == 0 && westEastPosition == 0;
    }
}