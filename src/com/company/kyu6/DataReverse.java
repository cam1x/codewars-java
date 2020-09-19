package com.company.kyu6;

/*
    Condition: https://www.codewars.com/kata/569d488d61b812a0f7000015
 */

public class DataReverse {
    public static int[] DataReverse(int[] data) {
        int numOfSegments = data.length / 8;
        int[] reversed = new int[data.length];
        for (int i = numOfSegments - 1, index = 0; i >= 0; i--) {
            for (int j = 0; j < 8; j++, index++) {
                reversed[index] = data[i * 8 + j];
            }
        }
        return reversed;
    }
}