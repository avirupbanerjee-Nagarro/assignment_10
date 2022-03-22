package com.nagarro.avirup.service;

import java.util.List;

import com.nagarro.avirup.model.User;

public interface UserService {

	List<User> getAllUsers();
	void saveUser(User user);
	
}
