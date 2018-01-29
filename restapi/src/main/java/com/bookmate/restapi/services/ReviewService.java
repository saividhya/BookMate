package com.bookmate.restapi.services;

import com.bookmate.restapi.models.Review;

public interface ReviewService {

	Review findOne(String id);
	<S extends Review>S save(S user);
	Iterable<Review> findAll(); 
}
