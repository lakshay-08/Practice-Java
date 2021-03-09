package com.example;

public class A extends Marks {
    int a,b,c;
    public A(int a,int b,int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double getPercentage() {
        return (a+b+c)/3;
    }
}
