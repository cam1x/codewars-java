package com.company.kyu5;

import java.math.BigDecimal;

/*
    Condition: https://www.codewars.com/kata/55a29405bc7d2efaff00007c
 */

public class Suite {
    public static double going(int n) {
        BigDecimal factorial = BigDecimal.ONE.setScale(6, BigDecimal.ROUND_UNNECESSARY);
        BigDecimal sum = BigDecimal.ZERO.setScale(6, BigDecimal.ROUND_UNNECESSARY);
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigDecimal.valueOf(i));
            sum = sum.add(factorial);
        }
        return sum.divide(factorial, BigDecimal.ROUND_FLOOR).doubleValue();
    }
}
