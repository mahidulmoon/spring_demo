package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeid;

    private String employeeName;

    public Long getEmployeeid() {
        return employeeid;
    }
//  no args constructor
    public Employee() {
    }

    //    constructor
    public Employee(Long employeeid, String employeeName) {
        this.employeeid = employeeid;
        this.employeeName = employeeName;
    }

    public void setEmployeeid(Long employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
