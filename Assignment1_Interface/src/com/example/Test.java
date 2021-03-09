package com.example;
interface parents{ void message();}
public class Test {
    public static void main(String args[])
    {
        sub1 s1 = new sub1();
        sub2 s2 = new sub2();
        s1.message();
        s2.message();
    }
}
