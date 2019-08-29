package com.company.kyu5;

/*
    Condition: https://www.codewars.com/kata/587319230e9cf305bb000098
 */

public class Soundex {

    public static String soundex(final String names) {
        char firstLetter;
        String[] words=names.split(" ");
        for (int i=0;i<words.length;i++){
            firstLetter=words[i].charAt(0);
            words[i]=words[i].toLowerCase()
                    .replaceAll("\\B[hw]","")
                    .replaceAll("[bfpv]","1")
                    .replaceAll("[cgjkqsxz]","2")
                    .replaceAll("[dt]","3")
                    .replaceAll("[l]","4")
                    .replaceAll("[mn]","5")
                    .replaceAll("[r]","6")
                    .replaceAll("(\\d)\\1+", "$1")
                    .replaceAll("\\B[aeiouy]","");
            if (Character.isDigit(words[i].charAt(0))){
                words[i]=firstLetter+words[i].substring(1);
            }
            if (words[i].matches(".+(\\d){0,2}")){
                words[i]=words[i]+"000";
            }
            words[i]=Character.toUpperCase(words[i].charAt(0))+words[i].substring(1,4);
        }
        return String.join(" ",words);
    }
}
