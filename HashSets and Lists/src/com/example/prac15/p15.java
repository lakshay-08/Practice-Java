package com.example.prac15;

import java.util.Iterator;
import java.util.TreeSet;

public class p15 {
    public static void main(String args[])
    {
        TreeSet<String> set=new TreeSet<String>();
        set.add("Red");
        set.add("Blue");
        set.add("Green");
        set.add("Pink");
        Iterator v = set.iterator();
        TreeSet<String> newSet = new TreeSet<String>();
        while(v.hasNext()) {
            newSet.add((String)v.next());
        }
        System.out.println("New Tree : "+newSet);
    }
}
