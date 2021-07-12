package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.services.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl employeeService;
	
	@GetMapping("/home")
	@ResponseBody
	public String home() {
		
		return "hello testme";
	}
	
	@PostMapping("/")
	public Employee saveEmployee(@RequestBody Employee employee) {
		
		return employeeService.saveEmployee(employee);
	}
	
	@GetMapping("/")
	public List<Employee> getEmployeeList() {
		
		return employeeService.getEmployeeList();
	}
	
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable("id") Long id) {
		
		return employeeService.getEmployeeList(id);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> deleteEmployeeById(@PathVariable("id") Long id) {
		try {
			employeeService.deleteEmployeeById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);	
		}
	}
	
	@PutMapping("/{id}")
	public Employee updateEmployee(@PathVariable("id") Long id,@RequestBody Employee employee) {
		
		return employeeService.updateEmployee(id, employee);
	}
}
