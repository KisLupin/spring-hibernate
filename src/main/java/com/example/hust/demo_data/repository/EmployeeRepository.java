package com.example.hust.demo_data.repository;

import com.example.hust.demo_data.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
