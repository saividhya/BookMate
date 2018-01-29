package com.bookmate.restapi.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bookmate.restapi.models.Review;
 
public interface ReviewRepository extends CrudRepository<Review, String>{
	
	@Override
	Review findOne(String id);
	 
	 @Override
	 <S extends Review>S save(S user);
	 
	 @Override
	 Iterable<Review> findAll(); 
	  
}
