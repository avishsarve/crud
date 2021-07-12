package com.example.services;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	
	IEmployeeRepository employeeRepository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getEmployeeList() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeList(Long id) {
		// TODO Auto-generated method stub
		Optional<Employee> employeeOp = employeeRepository.findById(id);
		return employeeOp.get();
	}

	@Override
	public void deleteEmployeeById(Long id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
	}

	@Override
	public Employee updateEmployee(Long id, Employee employee) {
Employee dbEmp=employeeRepository.findById(id).get();
		
		if (employee != null && Objects.nonNull(employee.getEmployeeName())
				&& !"".equalsIgnoreCase(employee.getEmployeeName())) {
			employee.setEmployeeName(employee.getEmployeeName());
		}
		if (employee != null && Objects.nonNull(employee.getEmployeeAddress())
				&& !"".equalsIgnoreCase(employee.getEmployeeAddress())) {
			employee.setEmployeeAddress(employee.getEmployeeAddress());
		}
		if (employee != null && Objects.nonNull(employee.getEmployeeCode())
				&& !"".equalsIgnoreCase(employee.getEmployeeCode())) {
			employee.setEmployeeCode(employee.getEmployeeCode());
		}
		return employeeRepository.save(dbEmp);
	}

}
