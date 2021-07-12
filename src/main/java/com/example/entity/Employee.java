package com.example.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long employeeId;
	String employeeCode;
	String employeeName;
	String employeeAddress;
	
	public Employee() {
		super();
		
	}public Employee(Long employeeId, String employeeCode, String employeeName, String employeeAddress) {
		super();
		this.employeeId = employeeId;
		this.employeeCode = employeeCode;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	}

	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeCode() {
		return employeeCode;
	}
	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeCode=" + employeeCode
				+ ", employeeName=" + employeeName + ", employeeAddress=" + employeeAddress + "]";
	}
}
