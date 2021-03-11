package com.example;

public class Employee {
    private String id;
    private String fn;
    private String ln;
    private String email;
    public Employee(String id,String fn,String ln,String email)
    {
        this.id=id;
        this.fn = fn;
        this.ln = ln;
        this.email = email;
    }
    public void display()
    {
        System.out.println("ID :"+this.id);
        System.out.println("First Name : "+this.fn);
        System.out.println("Last Name : "+this.ln);
        System.out.println("Email : "+this.email);

    }
}
