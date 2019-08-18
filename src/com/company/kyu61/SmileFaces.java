package com.company.kyu61;

import java.util.List;

/*
    Condition: https://www.codewars.com/kata/583203e6eb35d7980400002a
 */

public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        int count=0;
        for (String string:arr){
            if (string.matches("[:;](-|~)?[)D]")){
                count++;
            }
        }
        return count;
    }
}
