package com.company.kyu6;

import java.util.Arrays;

/*
    Condition: https://www.codewars.com/kata/550554fd08b86f84fe000a58
 */

public class WhichAreIn {
    public static String[] inArray(String[] array1, String[] array2) {

        int num = array1.length;
        boolean isContains;

        for (int i = 0; i < array1.length; i++) {
            isContains = false;
            for (String s : array2) {
                if (s.contains(array1[i])) {
                    isContains = true;
                    break;
                }
            }
            if (!isContains) {
                num--;
                array1[i] = " ";
            }
        }

        String[] res = new String[num];
        for (int i = 0, j = 0; i < array1.length; i++) {
            if (!array1[i].equals(" ")) {
                res[j] = array1[i];
                j++;
            }
        }

        Arrays.sort(res);
        return res;
    }
}
