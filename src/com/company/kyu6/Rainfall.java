package com.company.kyu6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    Condition: https://www.codewars.com/kata/56a32dd6e4f4748cc3000006
 */

public class Rainfall {
    public static double mean(String town, String strng) {
        if (!strng.contains(town + ":")) {
            return -1;
        }
        double avg = 0;
        int numOfMonth = 0;
        strng = strng.substring(strng.indexOf(town)).split("\n")[0];
        Pattern pattern = Pattern.compile("\\d+.\\d+");
        Matcher matcher = pattern.matcher(strng);
        while (matcher.find()) {
            avg += Double.parseDouble(matcher.group().trim());
            numOfMonth++;
        }
        return (numOfMonth >= 1) ? avg / numOfMonth : -1;
    }

    public static double variance(String town, String strng) {
        if (!strng.contains(town + ":")) {
            return -1;
        }
        double avg = mean(town, strng);
        double disp = 0;
        int numOfMonth = 0;
        strng = strng.substring(strng.indexOf(town)).split("\n")[0];
        Pattern pattern = Pattern.compile("\\d+.\\d+");
        Matcher matcher = pattern.matcher(strng);
        while (matcher.find()) {
            disp += Math.pow(Double.parseDouble(matcher.group().trim()) - avg, 2);
            numOfMonth++;
        }
        return (numOfMonth >= 1) ? disp / numOfMonth : -1;
    }
}
