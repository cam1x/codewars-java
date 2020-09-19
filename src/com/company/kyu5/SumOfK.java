package com.company.kyu5;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.IntStream;

/*
    Condition: https://www.codewars.com/kata/55e7280b40e1c4a06d0000aa
 */

public class SumOfK {
    private static int[] data;
    private static TreeSet<Integer> sums;

    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        sums = new TreeSet<>();
        data = new int[k];
        calculateSums(ls, k, 0, 0);

        final Iterator<Integer> it = sums.descendingIterator();
        while (it.hasNext()) {
            final Integer next = it.next();
            if (next <= t) {
                return next;
            }
        }
        return null;
    }

    private static void calculateSums(final List<Integer> ls, final int k, final int start, final int index) {
        if (index == k) {
            final int sum = IntStream.of(data).sum();
            sums.add(sum);
        } else {
            for (int i = start; i < ls.size(); i++) {
                data[index] = ls.get(i);
                calculateSums(ls, k, i + 1, index + 1);
            }
        }
    }
}
