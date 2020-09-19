package com.company.kyu7;

import java.util.function.ToDoubleFunction;

/*
    Condition: https://www.codewars.com/kata/java-functional-programming-part-2-multiline-functions
 */

public class FunctionalProgramming2 {
    public static ToDoubleFunction<Triangle> f = (Triangle triangle) -> {
        triangle.setArea(triangle.base * triangle.height * 0.5);
        return triangle.getArea();
    };
}


class Triangle {
    public final int height;
    public final int base;
    private double area;

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double a) {
        area = a;
    }
}