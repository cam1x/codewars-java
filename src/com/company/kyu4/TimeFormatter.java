package com.company.kyu4;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
    Condition: https://www.codewars.com/kata/52742f58faf5485cae000b9a
 */

public class TimeFormatter {
    public static String formatDuration(int seconds) {
        return seconds == 0 ? "now" : Arrays.stream(new String[]{
                format("year", (seconds / 31536000)),
                format("day", (seconds / 86400) % 365),
                format("hour", (seconds / 3600) % 24),
                format("minute", (seconds / 60) % 60),
                format("second", (seconds % 3600) % 60)})
                .filter(e -> e != "")
                .collect(Collectors.joining(", "))
                .replaceAll(", (?!.+,)", " and ");
    }

    public static String format(String s, int time) {
        return time == 0 ? "" : time + " " + s + (time == 1 ? "" : "s");
    }
}
