package com.example.demo.service;

import com.example.demo.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee createEmployee(Employee employee);
    public List<Employee> displayAllEmployee();
    public Employee getById(Integer id);
    public void deleteById(Integer id);
}
