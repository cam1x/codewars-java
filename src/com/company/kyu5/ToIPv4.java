package com.company.kyu5;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    Condition: https://www.codewars.com/kata/52e88b39ffb6ac53a400022e
 */

public class ToIPv4 {
    public static String longToIP(long ip) {
        StringBuilder sb = new StringBuilder(Long.toBinaryString(ip));
        while (sb.length() < 32) {
            sb.insert(0, 0);
        }
        return Stream.of(sb.toString()
                .split("(?=(.{8})+$)"))
                .map(x -> Integer.toString(Integer.parseInt(x, 2)))
                .collect(Collectors.joining("."));
    }
}
