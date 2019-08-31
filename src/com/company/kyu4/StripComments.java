package com.company.kyu4;

import java.util.stream.*;

/*
    Condition: https://www.codewars.com/kata/51c8e37cee245da6b40000bd
 */

public class StripComments {
    public static String stripComments(String text, String[] commentSymbols) {
        return Stream.of(text.split("\n"))
                .map(x->substringComments(x,commentSymbols))
                .collect(Collectors.joining("\n"));
    }

    private static String substringComments(String str, String[] commentSymbols){
        int index=-1;
        for (int i=0;i<commentSymbols.length;i++){
            if (str.contains(commentSymbols[i])){
                index=str.indexOf(commentSymbols[i]);
                break;
            }
        }
        return ((index==-1)?str:str.substring(0,index)).replaceAll("\\s+$", "");
    }
}
