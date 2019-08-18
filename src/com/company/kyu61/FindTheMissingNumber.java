package com.company.kyu61;

/*
    Condition: https://www.codewars.com/kata/5839edaa6754d6fec10000a2
 */

public class FindTheMissingNumber {

    public static char findMissingLetter(char[] array)
    {
        int time=array[0];
        for(int i=1;i<array.length;i++){
            if( (int)array[i]!=time+1 ){
                break;
            }
            time++;
        }
        return (char)(time+1);
    }
}
