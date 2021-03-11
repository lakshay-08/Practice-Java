package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main extends AgeComparator {
    static void validate(Employee e) throws ExceptionPossible
    {
     if(e.getAge()<16 || e.getAge() > 65)
     {
         throw new ExceptionPossible("Age is Invalid");
     }
     else if(!e.getName().matches("^[a-zA-Z]*$"))
     {
         throw new ExceptionPossible("Name can only contain alphabets");
     }
    }
    public static void main(String args[]) throws ParseException, IOException {
        Scanner ob = new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of Employees");
        int en = ob.nextInt();
        List<Employee> EmpO = new ArrayList<Employee>();
        for(int i = 0;i<en;i++)
        {
            System.out.println("Enter the details of Employee"+(i+1));
            String n = ob.next();
            String d = ob.next();
            Date dateOfJoining=new SimpleDateFormat("MM/dd/yyyy").parse(br.readLine());
            int age = ob.nextInt();
            int salary = ob.nextInt();
            EmpO.add(new Employee(n,d,age,salary,dateOfJoining));
            validate(EmpO.get(i));
        }

            System.out.println("1 Sort by Salary\n2 Sort by Age and Date of Joining");
            int ch = ob.nextInt();
            switch (ch)
            {
                case 1: Collections.sort(EmpO);
                        EmployeeBO.printEmployee(EmpO);
                        break;
                case 2: Collections.sort(EmpO,new AgeComparator());
                    EmployeeBO.printEmployee(EmpO);
            }
    }
}
