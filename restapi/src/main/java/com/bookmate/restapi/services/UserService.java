package com.bookmate.restapi.services;

import com.bookmate.restapi.models.User;

public interface UserService {
	
	  User findOne(String id);
	  User save(User user);
	  Iterable<User> findAll();
	  

}
