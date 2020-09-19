package com.company.kyu6;

/*
    Conditon: https://www.codewars.com/kata/5b40b666dfb4291ad9000049
 */

class Walker {
    public static int[] solve(int a, int b, int c, int alpha, int beta, int gamma) {
        double Xc = a * Math.cos(Math.toRadians(alpha)) + b *
                Math.cos(Math.toRadians(90 + beta)) + c * Math.cos(Math.toRadians(180 + gamma));
        double Yc = a * Math.sin(Math.toRadians(alpha)) + b *
                Math.sin(Math.toRadians(90 + beta)) + c * Math.sin(Math.toRadians(180 + gamma));
        int r = (int) Math.round(Math.sqrt(Xc * Xc + Yc * Yc));
        double a2 = 180 + Math.toDegrees(Math.atan(Yc / Xc));
        int aTan = (int) Math.floor(a2);
        double a1 = (a2 - Math.floor(a2)) * 60;
        int aTanM = (int) Math.floor(a1);
        int aTanS = (int) Math.floor((a1 - Math.floor(a1)) * 60);
        return new int[]{r, aTan, aTanM, aTanS};
    }
}
