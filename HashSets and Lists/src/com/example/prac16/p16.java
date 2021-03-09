package com.example.prac16;

import java.util.NavigableSet;
import java.util.TreeSet;

public class p16 {
    public static void main(String args[]) {
        TreeSet<String> set = new TreeSet<String>();
        set.add("Red");
        set.add("Blue");
        set.add("Green");
        set.add("Pink");
        System.out.println("Original Order : "+set);
        NavigableSet<String> tr=set.descendingSet();
        System.out.println("Reverse Order :"+tr);
    }
}
