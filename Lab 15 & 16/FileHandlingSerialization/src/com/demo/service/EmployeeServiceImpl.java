package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao edao=new EmployeeDaoImpl();
	Scanner sc=new Scanner(System.in);
	@Override
	public void readDataFromFile() {
		
		edao.readDataFromFile();
		
	}

	@Override
	public void addEmp() {
		System.out.println("Enter a eid");
		int id=sc.nextInt();
		
		System.out.println("Enter a ename");
		sc.nextLine();
		String ename=sc.next();
		
		System.out.println("Enter a mobile");
		
		String mobile=sc.next();
		
		Employee e=new Employee(id,ename,mobile);
		
		edao.addEmp(e);
		
		
	}

	@Override
	public List<Employee> displayAll() {
		
		
		return edao.displyAll();
	}

	@Override
	public void removeById() {
		System.out.println("Enter a eid u want to remove");
		int id=sc.nextInt();
		edao.removeById(id);
	}

	@Override
	public void writeDataToFile() {
		
		edao.writeDataToFile();
		
	}

}
