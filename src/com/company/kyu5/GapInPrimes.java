package com.company.kyu5;

/*
    Condition: https://www.codewars.com/kata/561e9c843a2ef5a40c0000a4
 */

public class GapInPrimes {

    public static long[] gap(int g, long m, long n) {
        for (long i=m;i<=n;i++){
            long nextPrime;
            if (isPrime(i) && (nextPrime=generateNextPrime(i,n))!=-1){
                if (nextPrime-i==g){
                    return new long[]{i,nextPrime};
                }
                i=nextPrime-1;
            }
        }
        return null;
    }

    private static boolean isPrime(long i) {
        for (long j = 2; j < i / 2; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    private static long generateNextPrime(final long START,final long END){
        for (long i=START+1;i<=END;i++){
            if (isPrime(i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        long[] res=gap(6,100,110);
        for (long el:res){
            System.out.print(el+" ");
        }
    }
}
