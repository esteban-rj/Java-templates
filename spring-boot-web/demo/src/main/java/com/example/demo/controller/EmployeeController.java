package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employee")
	public Iterable<Employee> employee() {
		return employeeService.getAllEmployee();
	}

	@GetMapping(value = "/employee",  params = "id")
	public Employee getEmployee(@RequestParam String id) {
		return employeeService.getEmployee(id);
	}

	@PostMapping("/employee")
	public String addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}

	@GetMapping("/employee/average-salary")
	public int getAverageSalary() {
		Double mean = employeeService.getAverageSalary();
		return mean.intValue();
	}

	@GetMapping("/employee/department")
	public Map<String, List<Employee>> getEmployeeByDepartment() {
		return employeeService.getEmployeeByDepartment();
	}

}