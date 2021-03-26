package com.example.demo.shared;
public class CustomerResponseModel
{
    private String accountID;
    private String firstName;
    private String lastName;
    private String Email;

    public CustomerResponseModel() {super();
    }

    public CustomerResponseModel(String accountID, String firstName, String lastName, String email) {
        this.accountID = accountID;
        this.firstName = firstName;
        this.lastName = lastName;
        Email = email;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
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
