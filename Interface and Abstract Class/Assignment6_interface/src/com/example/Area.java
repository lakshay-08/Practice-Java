package com.example;
public class Area implements Shape {
    @Override
    public void RectangleArea(double l, double b) {
        double area = l * b;
        System.out.println(area);
    }

    @Override
    public void SquareArea(double l) {
        double area = Math.pow(l,2);
        System.out.println(area);
    }

    @Override
    public void CircleArea(double r) {
        double area = Math.PI*Math.pow(r,2);
        System.out.println(area);
    }
}
