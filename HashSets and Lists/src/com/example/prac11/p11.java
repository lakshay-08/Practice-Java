package com.example.prac11;

import java.util.HashSet;

public class p11 {
    public static void main(String args[]) {
        HashSet<String> set1 = new HashSet<String>();
        set1.add("12");
        set1.add("1");
        set1.add("13");
        HashSet<String> set2 = new HashSet<String>();
        set2.add("12");
        set2.add("1");
        set2.add("13");
        set2.add("23");
        set2.add("7");
        System.out.println("Set1 : " + set1);
        System.out.println("Set2 : " + set2);
        System.out.println("Comparison of two sets : " + set1.equals(set2));
        set1.retainAll(set2);
        System.out.println("All the common elements : "+ set1);

    }
}
