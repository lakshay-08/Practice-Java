package com.example.prac8;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class p8 {
    public static void main(String args[]) {
        HashSet<String> sett = new HashSet<String>();
        sett.add("12");
        sett.add("1");
        sett.add("13");
        System.out.println("Hashset is : "+sett);
        Set<String> treeSet = new TreeSet<>(sett);
        System.out.println("TreeSet is : "+treeSet);
    }
}
