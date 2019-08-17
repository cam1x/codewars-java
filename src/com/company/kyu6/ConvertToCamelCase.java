package com.company.kyu6;

/*
    Condition: https://www.codewars.com/kata/517abf86da9663f1d2000003
 */

public class ConvertToCamelCase {

    public static String toCamelCase(String s){
        StringBuilder camelCase=new StringBuilder();
        char current;
        for(int i=0;i<s.length();i++){
            current=s.charAt(i);
            if(current=='-' || current=='_'){
                i++;
                camelCase.append(Character.toUpperCase(s.charAt(i)));
            }else{
                camelCase.append(current);
            }
        }

        return camelCase.toString();
    }

    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
    }
}
