package com.example.prac14;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class p14 {
    public static void main(String args[])
    {
        TreeSet<String> set=new TreeSet<String>();
        set.add("Red");
        set.add("Blue");
        set.add("Green");
        set.add("Pink");
        Iterator v = set.iterator();
        while(v.hasNext()) {System.out.println(v.next()); }
    }
}
