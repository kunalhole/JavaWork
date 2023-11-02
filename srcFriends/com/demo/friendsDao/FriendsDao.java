package com.demo.friendsDao;

import com.demo.beans.Friends;

public interface FriendsDao {

	void setSize(int size);
	void saveFriend(Friends f,int ind);
	void searchById(int id);
	void searchByName(String name);
	void displayAll();
	void searchByHobby(String hobby);
}
