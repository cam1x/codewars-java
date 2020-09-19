package com.company.kyu5;

/*
    Condition: https://www.codewars.com/kata/54521e9ec8e60bc4de000d6c
 */

public class Max {
    public static int sequence(int[] arr) {
        int currSum = 0;
        int maxSum = 0;

        for (int element : arr) {
            currSum = Math.max(0, currSum + element);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}
