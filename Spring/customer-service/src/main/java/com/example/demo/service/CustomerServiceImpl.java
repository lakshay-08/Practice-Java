package com.example.demo.service;

import com.example.demo.dto.Customerdto;
import com.example.demo.model.CustomerModel;
import com.example.demo.repo.CustomerRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{
    private CustomerRepository customerRepository;
    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        super();
        this.customerRepository = customerRepository;
    }

    @Override
    public Customerdto createAccount(Customerdto Customerdto) {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        CustomerModel model = mapper.map(Customerdto, CustomerModel.class);
        customerRepository.save(model);
        Customerdto dto= mapper.map(model, Customerdto.class);
        return dto;
    }

    @Override
    public Customerdto findByAccountId(String accountId) {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        CustomerModel model = customerRepository.findCustomerModelByAccountId(accountId);
        Customerdto dto= mapper.map(model, Customerdto.class);
        return dto;
    }

    @Override
    public Customerdto findByEmail(String email) {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        CustomerModel model = customerRepository.findCustomerModelByEmail(email);
        Customerdto dto= mapper.map(model, Customerdto.class);
        return dto;
    }

    @Override
    public Customerdto findByFirstName(String FirstName) {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        CustomerModel model = customerRepository.findCustomerModelByFirstName(FirstName);
        Customerdto dto= mapper.map(model, Customerdto.class);
        return dto;
    }

    @Override
    public Customerdto findByLastName(String LastName) {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        CustomerModel model = customerRepository.findCustomerModelByLastName(LastName);
        Customerdto dto= mapper.map(model, Customerdto.class);
        return dto;
    }

    @Override
    public List<CustomerModel> findModelByFirstOrLastName(String firstName, String lastName) {
        List<CustomerModel> customers=customerRepository.findModelByFirstOrLastName(firstName,lastName);
        return customers;
    }

    @Override
    public List<CustomerModel> findModelByFirstAndLastName(String firstName, String lastName) {
        List<CustomerModel> customers=customerRepository.findModelByFirstAndLastName(firstName,lastName);
        return customers;
    }


}
