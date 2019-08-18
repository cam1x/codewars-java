package com.company.kyu61;

/*
    Condition: https://www.codewars.com/kata/5264d2b162488dc400000001
 */

public class SpinWords {

    public String spinWords(String sentence) {
        String[] words=sentence.split(" ");
        String string=new String();
        StringBuilder str;

        for(int i=0;i<words.length;i++){
            if(words[i].length()>=5){
                str=new StringBuilder(words[i]);
                string+=str.reverse().toString()+" ";
            }else{
                string+=words[i]+" ";
            }
        }
        return string.substring(0,string.length()-1);
    }
}
