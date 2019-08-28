package com.company.kyu5;

/*
    Condition: https://www.codewars.com/kata/59ccf051dcc4050f7800008f
 */

public class Bud {

    public static String buddy(long start, long limit) {
        for (long i=start;i<limit;i++){
            final long secondNum =divSum(i)-1;
            if (secondNum>i){
                long secondSum = divSum(secondNum);
                if (secondSum - 1 == i) {
                    return "(" + i + " " + secondNum + ")";
                }
            }
        }
        return "Nothing";
    }

    static long divSum(long num) {
        long result = 0;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (i == (num / i)) {
                    result += i;
                }
                else {
                    result += (i + num / i);
                }
            }
        }
        return result + 1;
    }
}
