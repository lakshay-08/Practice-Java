package com.example;

public class Test {
    public static void main(String args[])
    {
        Animals c1 = new Cats();
        c1.cats();
        c1.dogs();
        Animals d1 = new Dogs();
        d1.dogs();
        d1.cats();
    }
}
