package com.maven.service;



import com.maven.model.User;

public interface UserService {
	
	public User findUser(String username, String password);
	public void insertUser(User user);
}
