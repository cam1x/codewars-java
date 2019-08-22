package com.company.kyu5;

import java.util.*;

public class JomoPipi {
    public static String jumbledString(String s, long n) {
        StringBuilder sb=new StringBuilder(s);
        List<Character> toInput=new ArrayList<>();
        for (int i=0;i<n;i++){
            for (int j=1;j<s.length();j+=2){
                toInput.add(s.charAt(j));
                sb.deleteCharAt(j-toInput.size());
            }
            for (Character input:toInput){
                sb.append(input);
            }
            toInput.clear();
        }
        return sb.toString();
    }
}
