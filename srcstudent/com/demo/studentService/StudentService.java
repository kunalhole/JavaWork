package com.demo.studentService;

public interface StudentService {

	void setSize();
	void createStudent();
	void findById(int id);
	void findByName(String name);
	void calculateGpa(int id);
}
