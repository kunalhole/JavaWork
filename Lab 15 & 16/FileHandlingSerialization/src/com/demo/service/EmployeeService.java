package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	void readDataFromFile();
	
	void addEmp();
	
	List<Employee> displayAll();
	
	void removeById();
	
	void writeDataToFile();
	
	
}
