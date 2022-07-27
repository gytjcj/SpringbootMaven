package com.maven.service;



import com.maven.model.User;

public interface UserService {
	
	public User getUser(String username, String password);
	public void insertUser(User user);
}
