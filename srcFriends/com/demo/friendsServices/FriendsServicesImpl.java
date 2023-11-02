package com.demo.friendsServices;

import java.util.Scanner;

import com.demo.beans.Friends;
import com.demo.friendsDao.FriendsDao;
import com.demo.friendsDao.FriendsDaoImpl;

public class FriendsServicesImpl implements FriendsServices {

	//Scanner class
	Scanner sc=new Scanner(System.in);
	int size=0;
	//creating object of FriendsDao 
	FriendsDao fdao;
	
	//creating the reference of the FriendsDaoImpl class
	public FriendsServicesImpl() {
		fdao=new FriendsDaoImpl();
	}
	
	//getting the size of the array from user
	public void setSize() {
		System.out.println("Enter a size of array");
		 size=sc.nextInt();
		
		fdao.setSize(size);
		
	}
	
	//adding Friends Details
	public void addFriends() {
		int id;
		String name,lastName,mobile,bdate,address,email;
		
		
	  for(int i=0;i<size;i++) {
		  
		  System.out.println("Enter a id");
		  id=sc.nextInt();
			
		  System.out.println("Enter a name");
		  name=sc.next();
			
		  System.out.println("Enter a lastName");
		  lastName=sc.next();
			
		  System.out.println("Enter a email");
		  email=sc.next();
			
		  System.out.println("Enter a mobile");
		  mobile=sc.next();
			
		  System.out.println("Enter a bdate");
		  bdate=sc.next();
			
		  System.out.println("Enter a address");
		  sc.nextLine();
		  address=sc.nextLine();
			
		  System.out.println("Enter a size of array u want to create for hobbies");
		  int si=sc.nextInt();
		  String[] hobbies=new String[si];
		  
		  for(int j=0;j<si;j++) {
			  System.out.println("Enter your hobby");
			  String str1=sc.next();
			  hobbies[j]=str1;
		  }
			
		  Friends fobj=new Friends(id,name,lastName,mobile,bdate,address,email,hobbies);
		  
		  fdao.saveFriend(fobj,i);
		  
		  
	  }
		
		
		
		
		
	}
	
	//search by id
	public void searchById() {
		System.out.println("Enter a id u want to search");
		int id1=sc.nextInt();
		fdao.searchById(id1);
	}
	 //search by name
	public void searchByName() {
		System.out.println("Enter a Name u want to search");
		String str1=sc.next();
		fdao.searchByName(str1);
	}
	//display all
	public void displayAll() {
		fdao.displayAll();
	}
	//search by hobby
	public void searchByHobby() {
		System.out.println("Enter a hobby u want to search");
		String str1=sc.next();
		
		fdao.searchByHobby(str1);
	}
	
}
