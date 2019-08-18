package com.company.kyu6;

/*
 Condition: https://www.codewars.com/kata/57b06f90e298a7b53d000a86
 */

public class SupermarketQueue {

    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] cashBox = new int[n];
        int indexOfCash = 0;
        int time = 0;

        for (int i = 0; i < customers.length; i++) {
            if (indexOfCash < n && cashBox[indexOfCash] == 0) {
                cashBox[indexOfCash] = customers[i];
                indexOfCash++;
            } else {
                int min = cashBox[0];
                indexOfCash = 0;
                for (int j = 0; j < cashBox.length; j++) {
                    if (min > cashBox[j]) {
                        min = cashBox[j];
                        indexOfCash = j;
                    }
                }
                for (int j = 0; j < cashBox.length; j++) {
                    cashBox[j] -= min;
                }
                i--;
                time += min;
            }
        }

        int max = cashBox[0];
        for (int element : cashBox) {
            if (max < element) {
                max = element;
            }
        }
        return time + max;
    }
}
