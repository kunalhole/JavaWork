package com.demo.studentDao;

import com.demo.beans.Student;



public class StudentDaoImpl implements StudentDao {

	static Student[] stu;
	
	
	public void setSize(int size) {
		stu=new Student[size];
	}
	
	public void saveStudent(Student s,int ind) {
		
		stu[ind]=s;
		
	}
	
	public void displayAll() {
		
		for(int i=0;i<stu.length;i++) {
			System.out.println(stu[i]);
		}
		
	}
	
	public void findById(int id) {
		boolean flag=false;
		int i=0;
		for(;i<stu.length;i++) {
			if(id==stu[i].getStuid()) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("Person with a give id Found below is the details");
			System.out.println(stu[i]);
		}else {
			System.out.println("Person with a give id Not Found...");
		}
	}
	
	public void findByName(String name) {
		boolean flag=false;
		int i=0;
		for(;i<stu.length;i++) {
			if(stu[i].getName().equals(name)) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("Person with a give name Found below is the details");
			System.out.println(stu[i]);
		}else {
			System.out.println("Person with a give name Not Found...");
		}
	}
	
	
	public void calculateGpa(int id) {
		boolean flag=false;
		System.out.println(id);
		int i=0;
		for(;i<stu.length;i++) {
			if(id==stu[i].getStuid()) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("Person with a give id Found below is the GPA of Student");
			
			System.out.println(0.33*(stu[i].getM1())+0.5*(stu[i].getM2())+0.25*(stu[i].getM3()));
			
		}else {
			System.out.println("Person with a give id Not Found...");
		}
	}
}
