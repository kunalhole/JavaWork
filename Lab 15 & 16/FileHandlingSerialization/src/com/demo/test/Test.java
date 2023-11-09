package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class Test {

	public static void main(String[] args) {
		
		EmployeeService es=new EmployeeServiceImpl();
		Scanner sc=new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.Read data from File.\n2.Add emp.\n3.Remove by id.\n4.write into file.\n5.DisplayAll.\n6.Exit");
			System.out.println("Enter a choice");
			ch=sc.nextInt();
			
			switch(ch) {
			
				case 1:
					es.readDataFromFile();
					break;
				
				case 2:
					es.addEmp();
					break;
				
				case 3:
					es.removeById();
					break;
				
				case 4:
					es.writeDataToFile();
					break;
				
				case 5:
					List<Employee> lt=new ArrayList<>();
					lt=es.displayAll();
					
					lt.stream().forEach(System.out::println);
					break;
				
				case 6:
					System.out.println("Thank you....");
					System.exit(0);
			}
			
		}while(ch!=6);
		
		

	}

}
