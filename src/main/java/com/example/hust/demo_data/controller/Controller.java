package com.example.hust.demo_data.controller;

import com.example.hust.demo_data.model.Employee;
import com.example.hust.demo_data.model.Person;
import com.example.hust.demo_data.repository.EmployeeRepository;
import com.example.hust.demo_data.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/getAll")
    public List<Person> getAll(){
        return personRepository.findAll();
    }
    @GetMapping("/getEmployee")
    public List<Employee> getAllEmp(){
        return employeeRepository.findAll();
    }
}
