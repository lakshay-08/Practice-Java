package com.example.demo.controller;
import com.example.demo.model.CustomerModel;
import com.example.demo.shared.*;
import com.example.demo.dto.Customerdto;
import com.example.demo.service.CustomerService;
import com.example.demo.shared.CustomerRequestModel;
import com.fasterxml.jackson.databind.util.JSONPObject;
import netscape.javascript.JSObject;
import org.json.JSONException;
import org.json.JSONObject;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class CustomerController {
    private CustomerService customerService;
    @Autowired
    public CustomerController(CustomerService customerService) {
        super();
        this.customerService = customerService;
    }
    @PostMapping("/accounts")
    public ResponseEntity<CustomerResponseModel> createAccount(@RequestBody CustomerRequestModel ccRequestModel)
    {
        ModelMapper mapper=new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        Customerdto customerdto=mapper.map(ccRequestModel, Customerdto.class);
        customerdto.setAccountID(UUID.randomUUID().toString());
        Customerdto response= customerService.createAccount(customerdto);
        CustomerResponseModel model=mapper.map(response, CustomerResponseModel.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(model);
    }
    @GetMapping("/accounts/{customerId}")
    public ResponseEntity<CustomerResponseModel> getAccountByAccountId(@PathVariable("customerId") String customerId)
    {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        Customerdto dto = customerService.findByAccountId(customerId);
        CustomerResponseModel response=mapper.map(dto, CustomerResponseModel.class);
        return ResponseEntity.ok(response);
    }
    @GetMapping("/accounts/email/{email}")
    public ResponseEntity<Customerdto> findAccountByEmail(@PathVariable("email") String email)
    {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        Customerdto dto=customerService.findByEmail(email);
        if(dto==null)
        {
            throw new RuntimeException("email not found");
        }
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }
    @GetMapping("/accounts/firstName/{firstName}")
    public ResponseEntity<Customerdto> findAccountByFirstName(@PathVariable("firstName") String FirstName)
    {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        Customerdto dto=customerService.findByFirstName(FirstName);
        if(dto==null)
        {
            throw new RuntimeException("First Name not Found");
        }
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }
    @GetMapping("/accounts/lastName/{lastName}")
    public ResponseEntity<Customerdto> findAccountByLastName(@PathVariable("lastName") String lastName)
    {
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        Customerdto dto=customerService.findByLastName(lastName);
        if(dto==null)
        {
            throw new RuntimeException("Last Name not Found");
        }
        return ResponseEntity.status(HttpStatus.OK).body(dto);
    }
    @GetMapping("/accounts/names/{firstName}/{lastName}")
    public ResponseEntity<List<CustomerResponseModel>> getModelByFirstAndLastName(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName)
    {
        List<CustomerModel> list=customerService.findModelByFirstAndLastName(firstName,lastName);
        List<CustomerResponseModel> responses=new ArrayList<CustomerResponseModel>();
        Iterator<CustomerModel> i=list.iterator();
        while(i.hasNext())
        {
            CustomerModel m=i.next();
            CustomerResponseModel model=new CustomerResponseModel();
            model.setAccountID(m.getAccountId());
            model.setEmail(m.getEmail());
            model.setFirstName(m.getFirstName());
            model.setLastName(m.getLastName());
            responses.add(model);
        }
        return ResponseEntity.ok(responses);
    }
    @GetMapping("/accounts/name/{firstName}/{lastName}")
    public ResponseEntity<List<CustomerResponseModel>> getByfirstorLastName(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName)
    {
        List<CustomerModel> list=customerService.findModelByFirstOrLastName(firstName,lastName);
        List<CustomerResponseModel> responses=new ArrayList<CustomerResponseModel>();
        Iterator<CustomerModel> i=list.iterator();
        while(i.hasNext())
        {
            CustomerModel m=i.next();
            CustomerResponseModel model=new CustomerResponseModel();
            model.setAccountID(m.getAccountId());
            model.setEmail(m.getEmail());
            model.setFirstName(m.getFirstName());
            model.setLastName(m.getLastName());
            responses.add(model);
        }
        return ResponseEntity.ok(responses);
    }

}
