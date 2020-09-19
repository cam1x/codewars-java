package com.company.kyu6;

import java.util.Arrays;

/*
    Condition: https://www.codewars.com/kata/52c31f8e6605bcc646000082
 */

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        Arrays.sort(numbers);
        int secondIndex;
        for (int i = 0; i < numbers.length; i++) {
            secondIndex = Arrays.binarySearch(numbers, target - numbers[i]);
            if (secondIndex >= 0) {
                return new int[]{i, secondIndex};
            }
        }
        return null;
    }
}
