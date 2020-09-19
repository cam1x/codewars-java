package com.company.kyu6;

import java.util.ArrayList;
import java.util.List;

/*
    Condition: https://www.codewars.com/kata/55466989aeecab5aac00003e
 */

public class SqInRect {
    public static List<Integer> sqInRect(int lng, int wdth) {
        if (lng == wdth) {
            return null;
        }
        List<Integer> sides = new ArrayList<>();
        int currSide;
        while (lng > 0 && wdth > 0) {
            currSide = Math.min(lng, wdth);
            sides.add(currSide);
            if (lng == currSide) {
                wdth -= currSide;
            } else {
                lng -= currSide;
            }
        }
        return sides;
    }

    public static void main(String[] args) {
        System.out.println(sqInRect(5, 3));
    }
}
