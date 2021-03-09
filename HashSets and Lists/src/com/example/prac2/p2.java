package com.example.prac2;

import java.util.Hashtable;
import java.util.Map;

public class p2 {
    public static void main(String args[])
    {
        Hashtable<Integer,String> hm = new Hashtable<Integer,String>();
        hm.put(100,"A");
        hm.put(200,"B");
        hm.put(300,"C");
        hm.put(400,"D");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+":"+m.getValue());
        }

    }
}
