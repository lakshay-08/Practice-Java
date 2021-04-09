package com.example.demo.controller;
import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

import javax.jms.Queue;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MessageController {
    private Queue queue;
    private JmsTemplate jmsTemplate;
    private EmployeeService employeeService;
    private EmployeeRepository employeeRepository;
    @Autowired
    public MessageController(Queue queue, JmsTemplate jmsTemplate, EmployeeService employeeService,EmployeeRepository employeeRepository) {
        this.queue = queue;
        this.jmsTemplate = jmsTemplate;
        this.employeeService = employeeService;
        this.employeeRepository = employeeRepository;
    }



    @PostMapping("/employee/create")
    public ResponseEntity<Employee> createCountry(@RequestBody Employee employee){
        jmsTemplate.convertAndSend(queue,"Created Employee!!");
        return ResponseEntity.status(HttpStatus.CREATED).body(employeeService.createEmployee(employee));
    }
   @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> findById(@PathVariable("id") Integer id) {
        Employee e = employeeService.getById(id);
        jmsTemplate.convertAndSend(queue,e.toString());
       return ResponseEntity.status(HttpStatus.OK).body(e);
    }
    @PutMapping("/employee/{id}")
    public ResponseEntity<Employee> updateById(@RequestBody Employee employee,@PathVariable("id") Integer id) {
        Employee e = employeeService.getById(id);
        e.setFirstName(employee.getFirstName());
        e.setLastName(employee.getLastName());
        e.setEmail(employee.getEmail());
        final Employee updated = employeeRepository.save(e);
        jmsTemplate.convertAndSend(queue,e.toString());
        return ResponseEntity.status(HttpStatus.OK).body(updated);
    }
    @DeleteMapping("/employee/{id}")
    public ResponseEntity<List<Employee>> deleteById(@PathVariable("id") final Integer id) {
        employeeService.deleteById(id);
        jmsTemplate.convertAndSend(queue,"Deleted Successfully!!");
        return ResponseEntity.status(HttpStatus.OK).body(null);
    }
    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> display() {
        jmsTemplate.convertAndSend(queue,"Displaying All Employees");
        return ResponseEntity.ok(employeeService.displayAllEmployee());
    }


}