package com.demo.beans;

import java.util.Arrays;

public class Friends {

	//data members of Friends class
	private int id;
	private String name,lastName,mobile,bdate,address,email;
	private String[] hobbies;
	
	
	
	
	public Friends() {
		super();
	}


	public Friends(int id, String name, String lastName, String mobile, String bdate, String address, String email,
			String[] hobbies) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.mobile = mobile;
		this.bdate = bdate;
		this.address = address;
		this.email = email;
		this.hobbies = hobbies;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getBdate() {
		return bdate;
	}


	public void setBdate(String bdate) {
		this.bdate = bdate;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String[] getHobbies() {
		return hobbies;
	}


	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public boolean checkHobby(String key) {
		for(int i=0;i<hobbies.length;i++) {
			if(hobbies[i].equals(key)) {
				return true;
			}
		}
		return false;
	}
	

	@Override
	public String toString() {
		return "Friends [id=" + id + ", name=" + name + ", lastName=" + lastName + ", mobile=" + mobile + ", bdate="
				+ bdate + ", address=" + address + ", email=" + email + ", hobbies=" + Arrays.toString(hobbies) + "]";
	}
	
	
	
	
}
