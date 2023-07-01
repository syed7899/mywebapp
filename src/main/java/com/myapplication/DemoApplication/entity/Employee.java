package com.myapplication.DemoApplication.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Entity
@Table(name="employee")
public class Employee {


    public Employee(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    @Id
    private int id;
    private String name;
    private BigDecimal salary;

}
