package com.maven.service.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.maven.dao.UserRepository;
import com.maven.model.User;
import com.maven.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	 @Autowired
	 UserRepository userRepository;
	
	 @Override
		public User getUser(String username, String password) {
		 return userRepository.getByPasswordAndUsername(username,password);
		 }
	 @Override
	    public void insertUser(User user) {
		 userRepository.save(user);
	    }
}
