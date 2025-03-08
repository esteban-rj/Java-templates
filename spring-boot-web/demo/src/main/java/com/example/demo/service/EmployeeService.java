package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;


@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public String addEmployee(Employee employee) {
        Employee employee1 = employeeRepository.save(employee);
        return employee1.getId();
    }

    public Iterable<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    public Employee getEmployee(String id) {
        return employeeRepository.findById(id).get();
    }

    public Double getAverageSalary() {
        Iterable<Employee> employeesIterable = employeeRepository.findAll();
        List<Employee> employees = new ArrayList<>();
        employeesIterable.forEach(employees::add);
        return employees
                .stream()
                .collect(Collectors.averagingDouble(mapper -> mapper.getSalary()));
    }

    public Map<String, List<Employee>> getEmployeeByDepartment() {
        Iterable<Employee> employeesIterable = employeeRepository.findAll();
        List<Employee> employees = new ArrayList<>();
        employeesIterable.forEach(employees::add);
        return employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
    }
}
