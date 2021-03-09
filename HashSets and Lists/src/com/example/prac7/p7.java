package com.example.prac7;


import java.util.HashSet;

public class p7 {
    public static void main(String args[]) {
        HashSet<String> sett = new HashSet<String>();
        sett.add("12");
        sett.add("1");
        sett.add("13");
        System.out.println("Hashset is : "+sett);
        Object[] arr = sett.toArray();
        System.out.println("The Array is :");
        for(int i = 0;i<arr.length;i++)
           System.out.println(arr[i]);

    }
}

