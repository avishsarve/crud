package com.example.services;

import java.util.List;

import com.example.entity.Employee;


public interface IEmployeeService {

	public Employee saveEmployee(Employee employee);
	public List<Employee> getEmployeeList();
	public Employee getEmployeeList(Long id);
	public void deleteEmployeeById(Long id);
	public Employee updateEmployee(Long id,Employee employee);
}
