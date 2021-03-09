package com.example.prac17;

import java.util.NavigableSet;
import java.util.TreeSet;

public class p17 {
    public static void main(String args[]) {
        TreeSet<String> set = new TreeSet<String>();
        set.add("Red");
        set.add("Blue");
        set.add("Green");
        set.add("Pink");
        System.out.println("First Element : "+set.first());
        System.out.println("Last Element : "+set.last());
    }
}
