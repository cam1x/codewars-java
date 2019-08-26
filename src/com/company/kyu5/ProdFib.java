package com.company.kyu5;

/*
    Condition: https://www.codewars.com/kata/5541f58a944b85ce6d00006a
 */

public class ProdFib {

    public static long[] productFib(long prod) {
        long prev=0, current=1;
        do{
            long time=current;
            current+=prev;
            prev=time;

        } while (current*prev<prod);
        return new long[]{prev,current,(current*prev==prod)?1:0};
    }
}
