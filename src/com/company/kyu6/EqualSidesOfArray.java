package com.company.kyu6;

/*
    Condition: https://www.codewars.com/kata/5679aa472b8f57fb8c000047
 */

public class EqualSidesOfArray {
    public static int findEvenIndex(int[] arr) {
        int result = -1;
        int sum1, sum2;

        for (int i = 0; i < arr.length; i++) {
            sum1 = sum2 = 0;

            for (int j = 0; j < i; j++) {
                sum1 += arr[j];
            }

            for (int k = arr.length - 1; k > i; k--) {
                sum2 += arr[k];
            }

            if (sum1 == sum2) {
                result = i;
                break;
            }
        }
        return result;
    }
}
