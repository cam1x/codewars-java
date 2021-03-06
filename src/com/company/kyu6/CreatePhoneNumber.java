package com.company.kyu6;

/*
    Condition: https://www.codewars.com/kata/525f50e3b73515a6db000b83
 */

public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder string = new StringBuilder("(" + numbers[0] + numbers[1] + numbers[2] + ") ");
        for (int i = 3; i < numbers.length; i++) {
            string.append(numbers[i]);
            if (i == 5) {
                string.append("-");
            }
        }
        return string.toString();
    }
}
