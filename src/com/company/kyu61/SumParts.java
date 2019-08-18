package com.company.kyu61;

/*
    Condition: https://www.codewars.com/kata/5ce399e0047a45001c853c2b
 */

class SumParts {

    public static int[] sumParts(int[] ls) {
        int[] sums=new int[ls.length+1];

        for(int i=0;i<ls.length;i++){
            sums[0]+=ls[i];
        }

        for(int i=1;i<ls.length;i++){
            sums[i]=sums[i-1]-ls[i-1];
        }

        return sums;
    }
}
