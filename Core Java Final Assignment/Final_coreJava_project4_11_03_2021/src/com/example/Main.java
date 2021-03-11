package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of Contacts:");
        int x = ob.nextInt();
        List<Contact> l = new ArrayList<Contact>();
        for(int i=0;i<x;i++)
        {
            System.out.println("Enter Details of Contact "+(i+1));
            System.out.println("Enter Name");
            String n = ob.next();
            System.out.println("Enter Email");
            String e = ob.next();
            System.out.println("Enter Mobile");
            Long no = ob.nextLong();
            System.out.println("Enter address");
            String ad = ob.next();;
            l.add(new Contact(n,e,no,ad));
        }
        System.out.println("Contact list after sorting according to phone number in descending order");
        Collections.sort(l);
        for(int i=0;i<l.size();i++)
        {
            System.out.println(l.get(i).getName()+"-"+l.get(i).getMobile());
        }
    }
}
