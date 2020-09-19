package com.company.kyu6;

/*
    Condition: https://www.codewars.com/kata/564057bc348c7200bd0000ff
 */

class Thirteen {
    public static long calc(long n) {
        int[] divisions = {1, 10, 9, 12, 3, 4};
        long thirt = 0;
        int j = 0;
        while (n > 0) {
            thirt += (n % 10) * divisions[j];
            n /= 10;
            j = (j + 1) % 6;
        }
        return thirt;
    }

    public static long thirt(long n) {
        while (n != calc(n)) {
            n = calc(n);
        }
        return n;
    }
}
