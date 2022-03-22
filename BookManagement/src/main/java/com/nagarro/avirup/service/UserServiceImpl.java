package com.nagarro.avirup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.avirup.model.User;
import com.nagarro.avirup.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;

	@Override
	public void saveUser(User user) {
		this.userRepository.save(user);
		
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

}
