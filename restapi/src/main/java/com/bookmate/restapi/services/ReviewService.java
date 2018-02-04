package com.bookmate.restapi.services;

import java.util.List;

import com.bookmate.restapi.models.Review;

public interface ReviewService {

	Review findOne(String id);
	Review save(Review review);
	Review updateReview(String id,Review review);
	Iterable<Review> findAll(); 
	List<String> getDistinctCategories();
}
