package com.company.kyu5;

import java.util.*;
import java.util.stream.Collectors;

/*
    Condition: https://www.codewars.com/kata/57591ef494aba64d14000526
 */

public class Johnann {

    private static List<Long> katasJohn=new ArrayList<Long>(Arrays.asList(0L));
    private static List<Long> katasAnn=new ArrayList<Long>(Arrays.asList(1L));

    public static List<Long> john(long n) {
        if (n<=katasJohn.size()){
            return katasJohn.stream().limit(n).collect(Collectors.toList());
        }
        fill(n);
        return katasJohn;
    }

    public static List<Long> ann(long n) {
        if (n<=katasJohn.size()){
            return katasAnn.stream().limit(n).collect(Collectors.toList());
        }
        fill(n);
        return katasAnn;
    }

    public static long sumJohn(long n) {
        return john(n).stream().mapToLong(Long::longValue).sum();
    }
    public static long sumAnn(long n) {
        return ann(n).stream().mapToLong(Long::longValue).sum();
    }

    private static void fill(long n){
        for (int i=katasJohn.size();i<n;i++){
            katasJohn.add(i-katasAnn.get(Math.toIntExact(katasJohn.get(i-1))));
            katasAnn.add(i-katasJohn.get(Math.toIntExact(katasAnn.get(i-1))));
        }
    }
}
