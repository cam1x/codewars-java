package com.company.kyu61;

/*
    Conditon: https://www.codewars.com/kata/5b40b666dfb4291ad9000049
 */

class Walker {

    public static int[] solve(int a, int b, int c, int alpha, int beta, int gamma) {
        double Xc=a*Math.cos(Math.toRadians(alpha))+b*Math.cos(Math.toRadians(90+beta))+c*Math.cos(Math.toRadians(180+gamma));
        double Yc=a*Math.sin(Math.toRadians(alpha))+b*Math.sin(Math.toRadians(90+beta))+c*Math.sin(Math.toRadians(180+gamma));
        int r=(int)Math.round(Math.sqrt(Xc*Xc+Yc*Yc));
        int atan=(int)Math.floor(180+Math.toDegrees(Math.atan(Yc/Xc)));
        int atanm=(int)Math.floor((180+Math.toDegrees(Math.atan(Yc/Xc))-Math.floor(180+Math.toDegrees(Math.atan(Yc/Xc))))*60);
        int atans=(int)Math.floor(((180+Math.toDegrees(Math.atan(Yc/Xc))-Math.floor(180+Math.toDegrees(Math.atan(Yc/Xc))))*60-Math.floor((180+Math.toDegrees(Math.atan(Yc/Xc))-Math.floor(180+Math.toDegrees(Math.atan(Yc/Xc))))*60))*60);
        return new int[]{r,atan,atanm,atans};
    }
}
