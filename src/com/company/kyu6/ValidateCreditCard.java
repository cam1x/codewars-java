package com.company.kyu6;

/*
    Condition: https://www.codewars.com/kata/5418a1dd6d8216e18a0012b2
 */

public class ValidateCreditCard {
    public static boolean validate(String n) {
        int[] numbers = new int[n.length()];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Character.getNumericValue(n.charAt(i));
        }

        for (int i = numbers.length - 2; i >= 0; i -= 2) {
            numbers[i] *= 2;
            if (numbers[i] > 9) {
                numbers[i] -= 9;
            }
        }

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum % 10 == 0;
    }
}
