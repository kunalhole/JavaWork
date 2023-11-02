package com.demo.studentService;

import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.studentDao.*;

public class StudentServiceImpl implements StudentService {

	Scanner sc=new Scanner(System.in);
	int size=0;
	
	StudentDao sdao;
	
    public StudentServiceImpl() {
    	sdao=new StudentDaoImpl();
    }
	@Override
	public void setSize() {
		System.out.println("Enter a size of student you want to create");
		
		 size=sc.nextInt();
		
		sdao.setSize(size);
	}
	
	@Override
	public void createStudent() {
		int sid,m1,m2,m3;
		String name;
		
		for(int i=0;i<size;i++) {
			
			System.out.println("Enter a student id");
			sid=sc.nextInt();
			
			System.out.println("Enter a Student Name");
			name=sc.next();
			
			System.out.println("Enter a Student marks m1");
			m1=sc.nextInt();
			
			System.out.println("Enter a Student marks m2");
			m2=sc.nextInt();
			
			System.out.println("Enter a Student marks m3");
			m3=sc.nextInt();
			
			
			Student s=new Student(sid,m1,m2,m3,name);
			
			
			
			sdao.saveStudent(s,i);
			
		}
		
	}
	
	public void displayAll() {
		sdao.displayAll();
	}
	
	public void findById(int id) {
		sdao.findById(id);
	}
	
	public void findByName(String name) {
		sdao.findByName(name);
	}
	public void calculateGpa(int id) {
		sdao.calculateGpa(id);
	}
 
}
