package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        String s = ob.next();
        if(UserMainCode.validate(s))
        {
            System.out.println("Valid Password");
        }
        else
        {
            System.out.println("Invalid Password");
        }
    }
}
