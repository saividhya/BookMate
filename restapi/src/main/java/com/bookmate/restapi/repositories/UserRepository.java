package com.bookmate.restapi.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bookmate.restapi.models.User;
 
public interface UserRepository extends CrudRepository<User, String> {
	
	 @Override
	 User findOne(String id);
	 
	 @Override
	 <S extends User>S save(S user);
	 
	 @Override
	 Iterable<User> findAll(); 
 
}
