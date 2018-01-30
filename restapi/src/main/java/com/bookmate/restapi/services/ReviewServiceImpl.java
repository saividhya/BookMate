package com.bookmate.restapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmate.restapi.models.Review;
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
	public Review save(Review r) {
		Review review = repository.save(r);
		return review;
	}

	@Override
	public Iterable<Review> findAll() {
		Iterable<Review> reviews = repository.findAll();
		return reviews;
	}

	@Override
	public Review updateReview(String id,Review review) {
		Review r = findOne(id);
	 	if(review.getBookName()!=null)
	 		r.setBookName(review.getBookName());
	 	if(review.getComments()!=null)
	 		r.setComments(review.getComments());
	 	if(review.getRatings()!=0)
	 		r.setRatings(review.getRatings());
	 	if(review.getAuthor()!=null)
	 		r.setAuthor(review.getAuthor());
	 	if(review.getPublisher()!=null)
	 		r.setPublisher(review.getPublisher());
	 	if(review.getImage()!=null)
	 		r.setImage(review.getImage());
	 	if(review.getUser()!=null)
	 		r.setUser(review.getUser());
	 	if(review.getReview()!=null)
	 		r.setReview(review.getReview());
	 	if(review.getGenre()!=null)
	 		r.setGenre(review.getGenre());
	 	save(r);
		return r;
	}

}
