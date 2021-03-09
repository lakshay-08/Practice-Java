package com.example.prac1;

import java.util.HashSet;
import java.util.Scanner;

public class p1 {
    public static void main(String args[])
    {
        HashSet<String> set = new HashSet<String>();
        set.add("12");
        set.add("1");
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the element to be added to the hashset");
        String s = ob.next();
        set.add(s);
        System.out.println(set);
    }
}
