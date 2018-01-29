package com.bookmate.restapi.services;

import com.bookmate.restapi.models.User;

public interface UserService {
	
	  User findOne(String id);
	  <S extends User>S save(S user);
	  Iterable<User> findAll();
	  

}
