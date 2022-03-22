package com.nagarro.avirup.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.nagarro.avirup.model.User;

@Component
public class Authenticator {

	public boolean check(List<User> list, User user)
	{
		for(User u : list)
		{
			if(u.getUserId().equals(user.getUserId()) && u.getPassword().equals(user.getPassword()))
			{
				return true;
			}
		}
		
		return false;
	}
}
