package com.example.prac4;

import java.util.HashSet;

public class p4 {
    public static void main(String args[])
    {
        HashSet<String> set = new HashSet<String>();
        set.add("12");
        set.add("1");
        set.add("13");
        System.out.println("Before clearing all elements"+set);
        set.clear();
        System.out.println("After clearing all elements"+set);
    }
}
