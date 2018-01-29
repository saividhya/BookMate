package com.bookmate.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bookmate.restapi.models.User;
import com.bookmate.restapi.services.UserService;

@RestController
@CrossOrigin("*")
public class UserController {
	
	 @Autowired
	 UserService userservice;
	 
	 @RequestMapping(method=RequestMethod.POST, value="/user")
	    public String save(@RequestBody User user) {
		 userservice.save(user);
	     return user.getId();
	    }

	 @RequestMapping(method=RequestMethod.GET, value="/user/{id}")
	    public User findById(@PathVariable String id) {
	        return userservice.findOne(id);
	    }
	 
	 @RequestMapping(method=RequestMethod.GET, value="/users")
	    public Iterable<User> findAllUsers() {
	        return userservice.findAll();
	    }

}
