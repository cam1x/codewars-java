package com.company.kyu6;

import java.util.ArrayList;
import java.util.List;

/*
    Condition: https://www.codewars.com/kata/554ca54ffa7d91b236000023
 */

public class EnoughIsEnough {
    public static int numOfContaining(List<Integer> list, final int NUM) {
        int num = 0;
        for (Integer integer : list) {
            if (integer == NUM) {
                num++;
            }
        }
        return num;
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        if (elements.length == 0 || maxOccurrences == 0) {
            return new int[]{};
        }

        List<Integer> list = new ArrayList<>();

        for (int element : elements) {
            if (numOfContaining(list, element) < maxOccurrences) {
                list.add(element);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
