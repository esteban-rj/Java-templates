package com.example.demo.model;
import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
    
    @Id
    @UuidGenerator
    private String id;
    private String name;
    private String department;
    private String designation;
    private int salary;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
