package com.company.kyu5;

/*
    Condition: https://www.codewars.com/kata/52503c77e5b972f21600000e
 */

public class LargestDifference {

    public static int largestDifference(int[] data) {
        int difference=0;
        for (int i=0;i<data.length;i++){
            for (int j=data.length-1;j>i;j--){
                if (data[i]<=data[j] && j-i>difference){
                    difference=j-i;
                    break;
                }
            }
        }
        return difference;
    }
}
