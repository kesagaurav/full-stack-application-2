package com.gaurav.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.model.Employee;
import com.gaurav.service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody Employee e) {
		// TODO Auto-generated method stub
		System.out.println(e);
		return service.createEmployee(e);
	}

	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable int id) {
		service.deleteEmployee(id);

	}

	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee e) {
		// TODO Auto-generated method stub
		return service.updateEmployee(e);
	}

	@GetMapping("/employee/{empid}")
	public Employee getEmployeeById(@PathVariable int empid) {
		// TODO Auto-generated method stub
		return service.getEmployeeById(empid);
	}

	@GetMapping("/employees")
	public List<Employee> getAllEmployess() {
		// TODO Auto-generated method stub
		return service.getAllEmployess();
	}

}
