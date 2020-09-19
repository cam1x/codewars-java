package com.company.kyu6;

/*
    Condition: https://www.codewars.com/kata/578aa45ee9fd15ff4600090d
 */

public class SortOdd {
    public static int[] sortArray(int[] array) {

        if (array == null || array.length == 0) return array;

        int maxInd;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                maxInd = i;
                for (int j = i; j < array.length; j++) {
                    if (array[j] % 2 == 1 && array[j] < array[maxInd]) {
                        maxInd = j;
                    }
                }

                int temp = array[i];
                array[i] = array[maxInd];
                array[maxInd] = temp;
            }
        }
        return array;
    }
}
