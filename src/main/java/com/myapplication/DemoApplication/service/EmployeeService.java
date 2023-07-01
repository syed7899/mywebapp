package com.myapplication.DemoApplication.service;

import com.myapplication.DemoApplication.entity.Employee;

import java.util.Optional;

public interface EmployeeService {
    public Optional<Employee> findById(int id);

}
