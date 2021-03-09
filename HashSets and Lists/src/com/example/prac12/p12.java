package com.example.prac12;

import java.util.HashSet;

public class p12 {
    public static void main(String args[]) {
        HashSet<String> set1 = new HashSet<String>();
        set1.add("12");
        set1.add("1");
        set1.add("13");
        System.out.println("Set is : " + set1);
        set1.clear();
        System.out.println("Set after removing everythin is : " + set1);
    }
}
