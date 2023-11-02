package com.demo.friendsTest;

import java.util.Scanner;

import com.demo.friendsServices.FriendsServicesImpl;



public class FriendTest {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		FriendsServicesImpl obj=new FriendsServicesImpl();

		do {
			
			System.out.println("1.Set a size of array of objects.\n2.Insert a friends data.\n3.Display All Friends.\n4.Search by id.\n5.Search by name.\n6.Display all friend with a particular hobby.\n7.Exit");
			System.out.println("Enter a choice");
			choice=sc.nextInt();
			
			switch(choice) {
			  
				case 1:
					obj.setSize();
					break;
				
				case 2:
					obj.addFriends();
					break;
				
				case 3:
					obj.displayAll();
					break;
				
				case 4:
					obj.searchById();
					break;
				
				case 5:
					obj.searchByName();
					break;
				
				case 6:
					obj.searchByHobby();
					break;
				
				case 7:
					System.out.println("Thank you...❤❤❤");
					System.exit(0);
					
				
			
			}
			
			
		}while(choice!=7);
		

	}

}
