package com.company.kyu5;

/*
    Condition: https://www.codewars.com/kata/52756e5ad454534f220001ef
 */

public class LCS {

    public static String lcs(String x, String y) {
        if (x==null || y==null || x.length()==0 || y.length()==0){
            return "";
        }

        if (x.charAt(x.length()-1)==y.charAt(y.length()-1)){
            return lcs(x.substring(0,x.length()-1),y.substring(0,y.length()-1)) + x.charAt(x.length()-1);
        }

        String s1=lcs(x.substring(0,x.length()-1),y);
        String s2=lcs(x,y.substring(0,y.length()-1));
        return (s1.length()>s2.length())?s1:s2;
    }
}
