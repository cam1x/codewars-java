package com.company.kyu5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
    Condition: https://www.codewars.com/kata/5279f6fe5ab7f447890006a7
 */

public class PickPeaks {
    public static Map<String, List<Integer>> getPeaks(int[] arr) {
        Map<String, List<Integer>> result = new HashMap<String, List<Integer>>() {{
            put("pos", new ArrayList<>());
            put("peaks", new ArrayList<>());
        }};
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                int before = arr[i - 1];
                int index = i;
                while (i < arr.length - 1 && arr[i + 1] == arr[i]) {
                    i++;
                }
                if (i < arr.length - 1 && arr[i] > before && arr[i] > arr[i + 1]) {
                    result.get("pos").add(index);
                    result.get("peaks").add(arr[index]);
                }
            }
        }
        return result;
    }
}