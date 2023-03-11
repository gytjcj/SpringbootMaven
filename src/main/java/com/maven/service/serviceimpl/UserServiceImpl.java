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
		public User findUser(String username, String password) {
		 return userRepository.findByPasswordAndUsername(username,password);
		 }
	 @Override
	    public void insertUser(User user) {
		 userRepository.save(user);
	    }
}
