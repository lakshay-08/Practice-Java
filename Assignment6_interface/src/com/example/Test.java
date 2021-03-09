package com.example;
interface Shape {
    void RectangleArea(double l,double b);
    void SquareArea(double l);
    void CircleArea(double r);

}
public class Test {
    public static void main(String args[])
    {
        Shape s = new Area();
        s.RectangleArea(5,8);
        s.SquareArea(5.2);
        s.CircleArea(3.2);
    }
}