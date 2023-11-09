package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	void readDataFromFile();
	
	void addEmp(Employee e);
	
	List<Employee> displyAll();
	
	void removeById(int id);
	
	void writeDataToFile();
	
	
	
}
