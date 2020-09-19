package com.company.kyu6;

import java.util.ArrayList;
import java.util.List;

/*
    Condition: https://www.codewars.com/kata/5842df8ccbd22792a4000245
 */

public class ExpandedForm {
    public static String expandedForm(int num) {
        StringBuilder sb = new StringBuilder();
        List<Integer> numbers = new ArrayList<>();
        int power = 0;
        while (num > 0) {
            if (num % 10 != 0) {
                numbers.add((num % 10) * (int) Math.pow(10, power));
            }
            num /= 10;
            power++;
        }
        for (int i = numbers.size() - 1; i >= 0; i--) {
            sb.append(numbers.get(i).toString());
            if (i != 0) {
                sb.append(" + ");
            }
        }
        return sb.toString();
    }
}
