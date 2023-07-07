package com.myapplication.DemoApplication.controller;

import com.myapplication.DemoApplication.entity.Employee;
import com.myapplication.DemoApplication.service.EmployeeService;
import com.myapplication.DemoApplication.service.EmployeeServiceImpl;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping ("/api/employee")
@AllArgsConstructor
public class EmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);
    private EmployeeServiceImpl employeeService;




    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable("id") int id){
        logger.info("getEmployee method has been Called %s"+id);
       Optional<Employee> employee= employeeService.findById(id);
       if(employee.isPresent()){

       }

       return employee.get();

    }



    @GetMapping("/message")
    public String getMessage(){
        return "Hello How are you??";
    }

    @GetMapping("/stashmessagethrowghbrowsed")
    public String getStashMessage(){
        return "Hello I will now commit this method through browser";
    }
}
