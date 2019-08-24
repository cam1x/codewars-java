package com.company.kyu5;

/*
    Condition: https://www.codewars.com/kata/526989a41034285187000de4
 */

public class CountIPAddresses {
    public static long ipsBetween(String start, String end) {
        String[] startIPNums=start.split("\\.");
        String[] endIPNums=end.split("\\.");
        int result = 0;
        for(int i = 0; i < 4; i++) {
            result += (Integer.valueOf(endIPNums[i])
                    - Integer.valueOf(startIPNums[i]))
                    << (24 - i * 8);
        }
        return result;
    }
}
