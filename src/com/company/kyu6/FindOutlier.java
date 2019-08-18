package com.company.kyu6;

/*
    Condition: https://www.codewars.com/kata/5526fc09a1bbd946250002dc
 */

public class FindOutlier{

    public static int find(int[] integers){
        int remainder=1;
        int numOfOdds=0;

        for(int i=0;i<3;i++){
            if(Math.abs(integers[i]%2)==1){
                numOfOdds++;
            }
        }

        if(numOfOdds>1){
            remainder=0;
        }

        for(int i=0;i<integers.length;i++){
            if(Math.abs(integers[i]%2)==remainder){
                return integers[i];
            }
        }

        return 0;
    }
}
