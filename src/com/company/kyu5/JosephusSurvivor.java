package com.company.kyu5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
    Condition: https://www.codewars.com/kata/555624b601231dc7a400017a
 */

public class JosephusSurvivor {
    public static int josephusSurvivor(final int n, final int k) {
        List<Integer> people = IntStream.rangeClosed(1, n).boxed().collect(Collectors.toList());
        int toRemove = 0;
        while (people.size() != 1) {
            toRemove = (toRemove + k - 1) % people.size();
            people.remove(toRemove);
        }
        return people.get(0);
    }
}
