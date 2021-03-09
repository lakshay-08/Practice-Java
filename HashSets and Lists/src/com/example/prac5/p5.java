package com.example.prac5;

import java.util.HashSet;

public class p5 {
    public static void main(String args[])
    {
        HashSet<String> set = new HashSet<String>();
        set.add("12");
        set.add("1");
        set.add("13");
        System.out.println("Check if Hashset is Empty "+set.isEmpty());
        set.clear();
        System.out.println("After clearing all elements "+set.isEmpty());
    }}
