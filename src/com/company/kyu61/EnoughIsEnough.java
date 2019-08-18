package com.company.kyu61;

import java.util.*;

/*
    Condition: https://www.codewars.com/kata/554ca54ffa7d91b236000023
 */

public class EnoughIsEnough {

    public static int numOfContaining(List<Integer> list,final int NUM){
        int num=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)==NUM){
                num++;
            }
        }
        return num;
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        if(elements.length==0 || maxOccurrences==0){
            return new int[]{};
        }

        List<Integer> list=new ArrayList<>();

        for(int i=0;i<elements.length;i++){
            if(numOfContaining(list,elements[i])<maxOccurrences){
                list.add(Integer.valueOf(elements[i]));
            }
        }

        int[] result=new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
