package com.demo.studentDao;

import com.demo.beans.Student;

public interface StudentDao {

	void setSize(int size);
	
	void saveStudent(Student s,int ind);
	
	void displayAll();
	
	void findById(int id);
	
	void findByName(String name);
	
	void calculateGpa(int id);
	
}
