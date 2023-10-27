package Day3;

import java.util.Scanner;

public class StudentInfo {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
          Student s=new Student();
          StudentServices.createArray();
          StudentServices.addStudent();
          StudentServices.print();
          
          System.out.println("Given the index between "+0+" to"+StudentServices.getStudentLength());
          int _id=sc.nextInt();
          System.out.println(StudentServices.searchById(_id));
          
          
          System.out.println("Given the Name of Student");
          String str=sc.next();
          System.out.println(StudentServices.searchStudentName(str));
          System.out.println("Return the Count of Name how many times it is present in Student");
          String str1=sc.next();
          System.out.println(str1+" is having count "+StudentServices.getCountByName(str1));
          
          
          
          
	}

}
