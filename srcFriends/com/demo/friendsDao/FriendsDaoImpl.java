package com.demo.friendsDao;

import com.demo.beans.Friends;

public class FriendsDaoImpl implements FriendsDao {

	Friends[] fr;
	//set size
	public void setSize(int size) {
		fr=new Friends[size];
	}
	
	//save data into array
	public void saveFriend(Friends f,int ind) {
		fr[ind]=f;
	}
	
	public void searchById(int id) {
		for(int i=0;i<fr.length;i++) {
			if(fr[i].getId()==id) {
				System.out.println(fr[i]);
			}
		}
	}
	
	public void searchByName(String name) {
		for(int i=0;i<fr.length;i++) {
			if(fr[i].getName().equals(name)) {
				System.out.println(fr[i]);
			}
		}
	}
	
	public void displayAll() {
		for(int i=0;i<fr.length;i++) {
			System.out.println(fr[i]);
		}
	}
	
	public void searchByHobby(String hobby) {
		
		for(int i=0;i<fr.length;i++) {
			
			if(fr[i].checkHobby(hobby)) {
				System.out.println(fr[i]);
			}
			
	   }
		
	}
	
	
}
