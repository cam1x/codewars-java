package com.company.kyu5;

/*
    Condition: https://www.codewars.com/kata/5270d0d18625160ada0000e4
 */

public class Greed {

    public static int greedy(int[] dice){
        int points[] = new int[7];
        for (int elem:dice) {
            points[elem]++;
        }
        return points[1]/3*1000 + points[1]%3*100 + points[2]/3*200 + points[3]/3*300 +
                points[4]/3*400 + points[5]/3*500 + points[5]%3*50 + points[6]/3*600;
    }
}
