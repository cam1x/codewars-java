package com.company.kyu5;

import java.util.*;
import java.util.stream.*;

/*
    Condition: https://www.codewars.com/kata/57c6c2e1f8392d982a0000f2
 */

public class Histogram {

    public static String histogram(final int results[]) {
        List<String> hist=new ArrayList<>();
        String toAdd;
        hist.add(IntStream.rangeClosed(1,results.length)
                .mapToObj(Objects::toString)
                .collect(Collectors.joining(" ")));
        hist.add(Stream.generate(()->"-")
                .limit(2*results.length-1)
                .collect(Collectors.joining()));
        for (int i=0;i<Arrays.stream(results).max().getAsInt()+1;i++){
            toAdd="";
            for (int j=0;j<results.length;j++){
                if (i<results[j]){
                    toAdd+="# ";
                }else{
                    if (i==results[j] && i!=0){
                        toAdd+=results[j] + ((results[j]<=9)?" ":"");
                    }else {
                        toAdd += "  ";
                    }
                }
            }
            hist.add(toAdd.replaceFirst("\\s++$", ""));
        }
        Collections.reverse(hist);
        hist.remove("");
        return String.join("\n", hist)+"\n";
    }
}
