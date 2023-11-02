package com.demo.beans;

public class Student {

	
	private int stuid,m1,m2,m3;
	private String name;
	private double gpa=0;
	
	
	public Student() {
		super();
	}


	public Student(int stuid, int m1, int m2, int m3, String name) {
		super();
		this.stuid = stuid;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.name = name;
	}


	public int getStuid() {
		return stuid;
	}

    public double getGpa() {
    	return gpa;
    }
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}


	public int getM1() {
		return m1;
	}


	public void setM1(int m1) {
		this.m1 = m1;
	}
    
	public void setGpa(double gpa) {
		
	    	this.gpa=gpa;
	 }

	public int getM2() {
		return m2;
	}


	public void setM2(int m2) {
		this.m2 = m2;
	}


	public int getM3() {
		return m3;
	}


	public void setM3(int m3) {
		this.m3 = m3;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [stuid=" + stuid + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", name=" + name + "]";
	}
	
	
	

}
