package com.bookmate.restapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmate.restapi.models.User;
import com.bookmate.restapi.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
    UserRepository repository;
	
	@Override
	public User findOne(String id) {
		User user = repository.findOne(id);
        return user;
	}

	@Override
	public <S extends User> S save(S u) {
		User user = repository.save(u);
		return (S)user;
	}

	@Override
	public Iterable<User> findAll() {
		Iterable<User> users = repository.findAll();
		return users;
	}
	
}
