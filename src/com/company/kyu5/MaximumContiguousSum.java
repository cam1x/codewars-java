package com.company.kyu5;

/*
    Condition: https://www.codewars.com/kata/52f4261c95d6bff39a003096
 */

public class MaximumContiguousSum {
    public static int maxContiguousSum(final int[] arr) {
        int currSum = 0;
        int maxSum = 0;
        for (int element : arr) {
            currSum = Math.max(0, currSum + element);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
