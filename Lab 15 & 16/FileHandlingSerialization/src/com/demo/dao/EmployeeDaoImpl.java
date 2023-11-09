package com.demo.dao;


import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	static List<Employee> lst;
	{
		lst=new ArrayList<>();
	}

	
	
	public void readDataFromFile() {
	
	
		File f=new File("test.txt");
		if(f.exists()) {
			try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("test.txt"));){
			
				
				while(true) {
				   Employee e=(Employee)ois.readObject();
				   
				   lst.add(e);
					
				}
			}catch(StreamCorruptedException e) {
				System.out.println("Stream Is corrupted");
			}
			catch(EOFException e) {
				System.out.println("Reached to end of file");
				
			}catch(IOException|ClassNotFoundException e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		
	}

	@Override
	public void addEmp(Employee e) {
		
		lst.add(e);
		
	}

	@Override
	public List<Employee> displyAll() {
		
		
		
		return lst;
	}

	@Override
	public void removeById(int id) {
		
		for(Employee e:lst) {
			if(e.getEid()==id) {
				lst.remove(e);
			}
		}
		
	}

	@Override
	public void writeDataToFile() {
		
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("test.txt"));){
			
			for(Employee e:lst) {
				oos.writeObject(e);
			}
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		
	
	}

}
