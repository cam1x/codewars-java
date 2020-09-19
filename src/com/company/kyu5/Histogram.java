package com.company.kyu5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
    Condition: https://www.codewars.com/kata/57c6c2e1f8392d982a0000f2
 */

public class Histogram {
    public static String histogram(final int results[]) {
        List<String> hist = new ArrayList<>();
        StringBuilder toAdd;
        hist.add(IntStream.rangeClosed(1, results.length)
                .mapToObj(Objects::toString)
                .collect(Collectors.joining(" ")));
        hist.add(Stream.generate(() -> "-")
                .limit(2 * results.length - 1)
                .collect(Collectors.joining()));
        for (int i = 0; i < Arrays.stream(results).max().getAsInt() + 1; i++) {
            toAdd = new StringBuilder();
            for (int result : results) {
                if (i < result) {
                    toAdd.append("# ");
                } else {
                    if (i == result && i != 0) {
                        toAdd.append(result).append((result <= 9) ? " " : "");
                    } else {
                        toAdd.append("  ");
                    }
                }
            }
            hist.add(toAdd.toString().replaceFirst("\\s++$", ""));
        }
        Collections.reverse(hist);
        hist.remove("");
        return String.join("\n", hist) + "\n";
    }
}
