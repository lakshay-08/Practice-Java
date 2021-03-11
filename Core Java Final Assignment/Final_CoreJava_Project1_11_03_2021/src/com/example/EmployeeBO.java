package com.example;

import java.util.List;

public class EmployeeBO {
    static void printEmployee(List<Employee> e)
    {
        for (int i =0;i<e.size();i++) {
            System.out.println(e.get(i).toString());
        }
        }
}
