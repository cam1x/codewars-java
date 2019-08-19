package com.company.kyu5;

/*
    Condition: https://www.codewars.com/kata/52685f7382004e774f0001f7
 */

public class HumanReadableTime {

    public static String makeReadable(int seconds) {
        int hours=seconds/3600;
        int min=(seconds-hours*3600)/60;
        int sec=seconds-hours*3600-min*60;
        return String.format("%02d:%02d:%02d", hours, min, sec);
    }
}
