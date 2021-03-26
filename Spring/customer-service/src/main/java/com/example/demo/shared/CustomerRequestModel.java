package com.example.demo.shared;


public class CustomerRequestModel {
    private String firstName;
    private String lastName;
    private String Email;
    public CustomerRequestModel() {
        super();
    }
    public CustomerRequestModel(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        Email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}