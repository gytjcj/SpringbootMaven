package com.maven.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.maven.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	public User getByPasswordAndUsername(String username,String password);

}
