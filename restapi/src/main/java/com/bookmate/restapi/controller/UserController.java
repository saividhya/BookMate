package com.bookmate.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bookmate.restapi.models.User;
import com.bookmate.restapi.services.UserService;

@CrossOrigin(origins = { "http://localhost:8000" }, maxAge = 3000)
@RestController
public class UserController {
	
	 @Autowired
	 UserService userservice;
	 @RequestMapping(value = "http://localhost:8000",method = RequestMethod.OPTIONS)
	    public ResponseEntity handle() {
	        return new ResponseEntity(HttpStatus.OK);
	    }
	 
	 @RequestMapping(method=RequestMethod.POST, value="/user")
	    public User save(@RequestBody User user) {
		 userservice.save(user);
	     return user;
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
