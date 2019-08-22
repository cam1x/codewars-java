package com.company.kyu7;

import java.util.function.IntUnaryOperator;

/*
    Condition: https://www.codewars.com/kata/java-functional-programming-part-3-closured-for-business
 */

public class AdderFactory {
    /*
     * Make the "create" method (public, static). It accepts one parameter (int addTo) and returns
     * a function (make sure to use the appropriate type). This function accepts an integer,
     * adds "addTo" to that integer, and returns the result as an integer (integer-to-integer function).
     */
    public static IntUnaryOperator create(int addTo) {
        return num->num+addTo;
    }
}
