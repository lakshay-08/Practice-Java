package com.example;

public class Test {
    public static void main(String args[])
    {
        Marks s1 = new A(77,80,95);
        Marks s2 = new B(75,78,89,90);
        System.out.println(s1.getPercentage()+"%");
        System.out.println(s2.getPercentage()+"%");

    }
}
