package com.company.kyu6;

/*
    Condition: https://www.codewars.com/kata/5262119038c0985a5b00029f
 */

public class Prime {
    public static boolean isPrime(int num) {
        boolean prime;
        if (num <= 1) prime = false;
        else {
            prime = true;
            int i = 2;
            while (i * i <= num) {
                if (num % i != 0) {
                    i++;
                } else {
                    prime = false;
                    break;
                }
            }
        }

        return prime;
    }
}
