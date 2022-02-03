package com.gaurav.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.gaurav.model.Employee;
import com.gaurav.repository.EmployeeRepository;
import com.gaurav.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	@Override
	public Employee createEmployee(Employee e) {
		// TODO Auto-generated method stub
		return repository.save(e);
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		 repository.deleteById(id);
	}

	@Override
	public Employee updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		return repository.save(e);
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public List<Employee> getAllEmployess() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
