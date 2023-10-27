package Day3;

import java.util.Scanner;

public class StudentServices {
	
	static Student[] stu;
	    
	public static void createArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a size: ");
		
		int size=sc.nextInt();
		
			stu=new Student[size];
		
	}
	public static void addStudent() {
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<stu.length;i++) {
			
			  int sid;
		      String sname;
		      int m1;
		      int m2;
		      int m3;
			System.out.println("Enter a Student id Name: "+(i+1));
			sid=sc.nextInt();
			System.out.println("Enter a Student Name: "+stu.length+(i+1));
			sname=sc.next();
			System.out.println("Enter a Student M1: "+stu.length+(i+1));
			m1=sc.nextInt();
			System.out.println("Enter a Student M2: "+stu.length+(i+1));
			m2=sc.nextInt();
			System.out.println("Enter a Student M3: "+stu.length+(i+1));
			m3=sc.nextInt();
			
			stu[i]=new Student(sid,sname,m1,m2,m3);
			System.out.println("Student Recored Inserted Successfully...");
		
	}
	
		
		
	
	
}
	
public static void print() {
		for(int i=0;i<stu.length;i++) {
			System.out.println(stu[i]);
		}
	}

public static void singleStudent(Student s1) {
	System.out.println(s1);
}

public static Student searchById(int id) {
	
	for(Student s1:stu) {
		if(s1!=null) {
			if(s1.getId()==id) {
				return s1;
			}
		}
	}
	
	return null;
	
	
	
	
	
}
public static Student searchStudentName(String _name) {
	
	
	for(Student s1:stu) {
		if(s1!=null) {
			if((s1.getName()).equals(_name)) {
				return s1;
			}
		}
	}
	
	
	
	return null;
	
}

public static int getStudentLength() {
	return stu.length;
}
	

public static int getCountByName(String str) {
	
	int count=0;
	
	for(Student s1:stu) {
		if(s1!=null) {
			if((s1.getName()).equals(str)) {
				count++;
				System.out.println(s1);
			}
		}
	}
	
	
	if(count!=0) {
		return count;
	}else {
		return -1;
	}
}

	
}
