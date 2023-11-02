package com.demo.studentTest;

import java.util.Scanner;

import com.demo.studentService.StudentServiceImpl;

public class StudentTest {

	public static void main(String[] args) {
		
		StudentServiceImpl obj=new StudentServiceImpl();
		
		Scanner sc=new Scanner(System.in);
		
		int choice;
		
		do {
			System.out.println("1.setSize of Array of Student.\n2.Insert a data into Array of Student.\n3.Display All Student.\n4.Get Student by id\n5.Get Student by Name\n6.Get Gpa of any student with id\n7.Exit");
			choice=sc.nextInt();
			
			switch(choice) {
			
				case 1:
					obj.setSize();
					break;
				
				case 2:
					obj.createStudent();
					break;
				
				case 3:
					obj.displayAll();
					break;
				
				case 4:
					System.out.println("Enter a id");
					int id=sc.nextInt();
					obj.findById(id);
					break;
				
				case 5:
					System.out.println("Enter a Name");
					String name=sc.next();
					obj.findByName(name);
					break;
				
					
				case 6:
					System.out.println("Enter a id");
					int id1=sc.nextInt();
					obj.calculateGpa(id1);
					break;
					
				case 7:
					System.out.println("Thank You...");
					System.exit(0);
				
			}
			
			
			
		}while(choice!=7);
		
	
	

	}

}
