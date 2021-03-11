package com.example;

import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.text.ParseException;

public class Employee implements Comparable {
    static int count = 1;
    private int id;
    private String name;
    private String Department;
    private int age;
    private int salary;
    private Date dateOfJoining;
    public Employee(String name, String department, int age, int salary, Date dOJ) throws ParseException {
        super();
        id = count++;
        this.name = name;
        Department = department;
        this.age = age;
        this.salary = salary;
        this.dateOfJoining = dOJ;
    }

    public int getId() {
        return this.id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return Department;
    }
    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        Employee.count = count;
    }
    public void setDepartment(String department) {
        Department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    @Override
    public String toString() {
        String s = String.format("%-15s %-30s %-30s %-10s %-10s\n",this.getId(),this.getName(),this.getDepartment(),this.getDateOfJoining(),this.getAge(),this.getSalary());
        return s;
    }

    @Override
    public int compareTo(Object o) {
        Employee e = (Employee) o;
        if(this.getSalary()==e.getSalary())
        {
            return 0;
        }
        else if (this.getSalary()<e.getSalary())
            return 1;
        else
            return -1;
    }
}
