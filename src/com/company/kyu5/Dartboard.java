package com.company.kyu5;

/*
    Condition: https://www.codewars.com/kata/5870db16056584eab0000006
 */

public class Dartboard {
    private static final double bullEye = 12.7;
    private static final double bull = 31.8;
    private static final double tripleInner = 198;
    private static final double tripleOuter = 214;
    private static final double doubleInner = 324;
    private static final double doubleOuter = 340;
    private static final int[] sectors = {20, 1, 18, 4, 13, 6, 10, 15, 2, 17,
            3, 19, 7, 16, 8, 11, 14, 9, 12, 5};

    public static String getScore(double x, double y) {
        if (x * x + y * y >= doubleOuter * doubleOuter / 4) {
            return "X";
        }
        if (x * x + y * y < bullEye * bullEye / 4) {
            return "DB";
        }
        if (x * x + y * y < bull * bull / 4) {
            return "SB";
        }
        StringBuilder result = new StringBuilder();
        if (x * x + y * y < tripleOuter * tripleOuter / 4 && x * x + y * y >= tripleInner * tripleInner / 4) {
            result.append("T");
        } else {
            if (x * x + y * y < doubleOuter * doubleOuter / 4 && x * x + y * y >= doubleInner * doubleInner / 4) {
                result.append("D");
            }
        }

        int scIdx = (int) ((getAngle(x, y) + 9) / 18);
        scIdx = scIdx >= 20 ? 0 : scIdx;

        return result.append(sectors[scIdx]).toString();
    }

    private static double getAngle(double dx, double dy) {
        double degree = (Math.atan2(dx, dy) * 180) / Math.PI;
        return (degree < 0) ? degree + 360 : degree;
    }
}
