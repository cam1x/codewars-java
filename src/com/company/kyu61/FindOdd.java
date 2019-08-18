package com.company.kyu61;

import java.util.Arrays;

/*
    Condition: https://www.codewars.com/kata/54da5a58ea159efa38000836
 */

public class FindOdd {
    public static int findIt(int[] a) {

        Arrays.sort(a);
        int length;
        int odd=a[0];
        for(int i=0;i<a.length;i++){
            length=1;
            while(i<a.length-1 && a[i]==a[i+1]){
                length++;
                i++;
            }
            if(length%2==1){
                odd=a[i];
                break;
            }
        }
        return odd;
    }
}
