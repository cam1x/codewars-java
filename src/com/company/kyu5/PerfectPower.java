package com.company.kyu5;

/*
    Condition: https://www.codewars.com/kata/54d4c8b08776e4ad92000835
 */

public class PerfectPower {

    public static int[] isPerfectPower(int n) {
        int num=0, power=0, time=n;
        for (int i=2;i<=(int)Math.sqrt(n);i++){
            while(time%i == 0 && time > 1) {
                time/=i;
                power++;
            }
            if(time == 1) {
                return new int[] {i,power};
            }
            time = n;
            power = 0;
        }
        return null;
    }
}
