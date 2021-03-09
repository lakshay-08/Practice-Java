package com.example;

public class B implements Marks {
    int a,b,c,d;
    public B(int a,int b,int c,int d)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    @Override
    public double getPercentage() {
        return (a+b+c+d)/4;
    }

}