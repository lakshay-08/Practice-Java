package com.example.prac18;

import java.util.TreeSet;

public class p18 {
    public static void main(String args[]) {
        TreeSet<String> set = new TreeSet<String>();
        set.add("Red");
        set.add("Blue");
        set.add("Green");
        set.add("Pink");
        TreeSet<String> set2 = new TreeSet<String>();
        set2 = (TreeSet<String>)set.clone();
        System.out.println("Cloned Set : "+set2);
    }
}
