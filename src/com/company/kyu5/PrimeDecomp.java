package com.company.kyu5;

/*
    Condition: https://www.codewars.com/kata/54d512e62a5e54c96200019e
 */

public class PrimeDecomp {

    public static String factors(int n) {
        int power=0;
        StringBuilder sb=new StringBuilder();
        for (int primeNum=2;primeNum<Integer.MAX_VALUE;primeNum++){
            if (n==1){
                break;
            }
            while (n%primeNum==0){
                n/=primeNum;
                power++;
            }
            if (power > 0) {
                sb.append(String.format("(%1$d%2$s)", primeNum, power == 1 ? "" : String.format("**%1$d", power)));
            }
            power=0;
        }
        return sb.toString();
    }
}
