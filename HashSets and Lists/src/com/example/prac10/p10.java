package com.example.prac10;

import java.util.HashSet;

public class p10 {
    public static void main(String args[]) {
        HashSet<String> sett = new HashSet<String>();
        sett.add("12");
        sett.add("1");
        sett.add("13");
        HashSet<String> set = new HashSet<String>();
        sett.add("12");
        sett.add("1");
        sett.add("13");
        HashSet<String> setn = new HashSet<String>();
        setn = (HashSet)sett.clone();
        System.out.println("Comparison with  clone : " + sett.equals(setn));
        System.out.println("Comparison of two sets : " + sett.equals(set));

    }
}
