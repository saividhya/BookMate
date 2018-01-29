package com.bookmate.restapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmate.restapi.models.Review;
import com.bookmate.restapi.models.User;
import com.bookmate.restapi.repositories.ReviewRepository;

@Service
public class ReviewServiceImpl implements ReviewService{

	@Autowired
	ReviewRepository repository;
	
	@Override
	public Review findOne(String id) {
		Review review = repository.findOne(id);
        return review;
	}

	@Override
	public <S extends Review> S save(S r) {
		Review review = repository.save(r);
		return (S)review;
	}

	@Override
	public Iterable<Review> findAll() {
		Iterable<Review> reviews = repository.findAll();
		return reviews;
	}

}
