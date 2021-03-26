package com.example.demo.service;

import com.example.demo.dto.Customerdto;
import com.example.demo.model.CustomerModel;

import java.util.List;

public interface CustomerService {
    public Customerdto createAccount(Customerdto  accountDto);
    public Customerdto findByAccountId(String accountId);;
    public Customerdto  findByEmail(String email);
    public Customerdto  findByFirstName(String FirstName);
    public Customerdto findByLastName(String LastName);
    public List<CustomerModel> findModelByFirstOrLastName(String firstName, String lastName);
    public List<CustomerModel> findModelByFirstAndLastName(String firstName, String lastName);

}
