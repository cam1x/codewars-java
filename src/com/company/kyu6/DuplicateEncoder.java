package com.company.kyu6;

/*
    Condition: https://www.codewars.com/kata/54b42f9314d9229fd6000d9c
 */

public class DuplicateEncoder {

    public static boolean isUnique(String word, char letter){
        word=word.toLowerCase();
        letter=Character.toLowerCase(letter);
        return word.indexOf(letter) == word.lastIndexOf(letter);
    }

    public static String encode(String word){
        String encoded=new String();
        for(int i=0;i<word.length();i++){
            if(isUnique(word,word.charAt(i))){
                encoded+="(";
            }else{
                encoded+=")";
            }
        }
        return encoded;
    }
}
