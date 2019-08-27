package com.company.kyu5;

import java.util.*;
import java.util.stream.Collectors;

/*
    Condition: https://www.codewars.com/kata/554f76dca89983cc400000bb
 */

public class Dioph {

    public static String solEquaStr(long n) {
        List<String> solutions=new ArrayList<>();
        long x, y, b;
        for (long a=1;a<=Math.sqrt(n);a++){
            x=(n/a+a)/2;
            y=(n/a-a)/4;
            if (x*x -4*y*y==n){
                solutions.add("["+(n/a+a)/2+", "+(n/a-a)/4+"]");
            }
        }
        return solutions.stream().distinct().collect(Collectors.joining(", ","[","]"));
    }
}
