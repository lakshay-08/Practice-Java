package com.example;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeFactory {
    static void validate(List<String> t)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(\\.[a-zA-Z0-9_+&*-]+)*@([a-zA-Z0-9-]+\\.)[a-z" + "A-Z]{2,5}$";
        Pattern pat = Pattern.compile(emailRegex);
        if(t.size()<4) {
            throw new DataCorruptException("Data Seems to have missing values");
        }
        else if(t.size()>4)
        {
            throw new DataCorruptException("Data is Corrupt!!!");
        }
        else if(pat.matcher(t.get(3)).matches() != true) {
            System.out.println(t.get(3));
            throw new DataCorruptException("Invalid Email");
        }
        else if(t.get(1).matches("^[a-zA-Z]*$")!=true||t.get(2).matches("^[a-zA-Z]*$")!=true)
            {
                System.out.println(t.get(1)+" "+t.get(2));
                throw new DataCorruptException("Name can only contain Alphabets");
            }
        }
    List<Employee> empObjects = new ArrayList<Employee>();
    public List createEmployee()
    {
        List<String> empdata = new ArrayList<String>();
        try(BufferedReader br = Files.newBufferedReader(Paths.get("employee.txt")))
        {
            empdata = br.lines().collect(Collectors.toList());
        }catch(Exception e){e.printStackTrace();}
        for(int i = 0;i < empdata.size();i++)
        {
            List<String> splitemp = Arrays.asList((empdata.get(i)).split(","));
            validate(splitemp);
            empObjects.add(new Employee(splitemp.get(0),splitemp.get(1),splitemp.get(2),splitemp.get(3)));
        }
        return empObjects;
    }
}
