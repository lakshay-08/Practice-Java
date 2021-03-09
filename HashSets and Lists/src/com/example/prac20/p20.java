package com.example.prac20;

import java.util.TreeSet;

public class p20 {
    public static void main(String args[]) {
        TreeSet<String> set = new TreeSet<String>();
        set.add("Red");
        set.add("Blue");
        set.add("Green");
        set.add("Pink");
        TreeSet<String> set1 = new TreeSet<String>();
        set1.add("Red");
        set1.add("Blue");
        set1.add("Green");
        set1.add("Pink");
        TreeSet<String> set2 = new TreeSet<String>();
        set2 = (TreeSet<String>)set.clone();
        System.out.println("Comparison of two sets : "+set.equals(set1));
        System.out.println("Comparison with clone set : "+set.equals(set2));

    }
}
