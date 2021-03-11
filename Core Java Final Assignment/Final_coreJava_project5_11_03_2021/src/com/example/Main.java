package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String");
        String line=br.readLine();
        LetterSequence ls=new LetterSequence(line);
        TreeMap<String,Integer>frequencyMap=ls.computeFrequency();
        ls.displayFrequency(frequencyMap);
    }

}