package com.example.demo.repo;

import com.example.demo.model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerModel, Integer> {
    @Query
    public CustomerModel findCustomerModelByAccountId(String accountId);
    @Query
    public CustomerModel findCustomerModelByFirstName(String FirstName);
    @Query
    public CustomerModel findCustomerModelByLastName(String LastName);
    @Query
    public CustomerModel findCustomerModelByEmail(String Email);
    @Query(value="select * from CUSTOMER_DETAILS e where e.first_name=? and e.last_name = ?", nativeQuery = true)
    public List<CustomerModel> findModelByFirstAndLastName(String firstName, String lastName);
    @Query(value="select * from CUSTOMER_DETAILS e where e.first_name=? or e.last_name = ?", nativeQuery = true)
    public List<CustomerModel> findModelByFirstOrLastName(String firstName,String lastName);
}
