package com.company.kyu61;

/*
    Condition: https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec
 */

public class PersistentBugger {

    public static long multiplyDigits(long n){
        long multiply=1;
        while (n>0){
            multiply*=n%10;
            n/=10;
        }
        return multiply;
    }

    public static int persistence(long n){
        int count=0;
        while (n>9){
            count++;
            n=multiplyDigits(n);
        }
        return count;
    }
}
