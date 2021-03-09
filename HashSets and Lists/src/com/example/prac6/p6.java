package com.example.prac6;

import java.util.HashSet;

public class p6 {
    public static void main(String args[]) {
        HashSet<String> sett = new HashSet<String>();
        sett.add("12");
        sett.add("1");
        sett.add("13");
        HashSet<String> setn = new HashSet<String>();
        setn = (HashSet)sett.clone();
        System.out.println("Cloned Hashset : "+setn);
    }
}
