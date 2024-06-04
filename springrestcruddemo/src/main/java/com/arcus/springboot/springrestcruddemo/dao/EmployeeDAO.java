package com.arcus.springboot.springrestcruddemo.dao;

import java.util.List;

import com.arcus.springboot.springrestcruddemo.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
	
		
}
