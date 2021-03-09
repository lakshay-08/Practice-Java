package com.example.prac9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class p9 {
    public static void main(String args[]) {
        HashSet<String> sett = new HashSet<String>();
        sett.add("12");
        sett.add("1");
        sett.add("13");
        System.out.println("Hashset is : "+sett);
        List<String> list = new ArrayList<String>(sett);
        System.out.println("List is : "+list);

    }
}
