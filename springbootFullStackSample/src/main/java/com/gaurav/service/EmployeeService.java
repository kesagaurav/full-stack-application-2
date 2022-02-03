package com.gaurav.service;

import java.util.List;

import com.gaurav.model.Employee;

public interface EmployeeService  {

	public Employee createEmployee(Employee e);
	public void deleteEmployee(int id);
	public Employee updateEmployee(Employee e);
	public Employee getEmployeeById(int empid);
	public List<Employee> getAllEmployess();
	
	
	
}
