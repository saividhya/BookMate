package com.bookmate.restapi.repositories;

import java.util.List;

import com.bookmate.restapi.models.Review;
 
public interface ReviewRepository{
	
	Review findOne(String id);
	 
	Review save(Review review);
	 
	Iterable<Review> findAll(); 
	 
	List<String> getDistinctCategories();
}
