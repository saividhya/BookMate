package com.bookmate.restapi.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bookmate.restapi.models.Review;
 
public interface ReviewRepository extends CrudRepository<Review, String>{
	
	@Override
	Review findOne(String id);
	 
	 @Override
	 <S extends Review>S save(S review);
	 
	 @Override
	 Iterable<Review> findAll(); 
	 
	 List<Review> findByBookName(String title);
}
