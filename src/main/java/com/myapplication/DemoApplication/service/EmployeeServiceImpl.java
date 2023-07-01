package com.myapplication.DemoApplication.service;

import com.myapplication.DemoApplication.controller.EmployeeController;
import com.myapplication.DemoApplication.entity.Employee;
import com.myapplication.DemoApplication.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);
    private EmployeeRepository employeeRepository;
    public Optional<Employee> findById(int id) {
        logger.info("getEmployee method has been Called %s"+id);
        return employeeRepository.findById(id);
    }
}
