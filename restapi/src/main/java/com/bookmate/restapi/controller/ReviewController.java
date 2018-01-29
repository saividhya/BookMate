package com.bookmate.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bookmate.restapi.models.Review;
import com.bookmate.restapi.services.ReviewService;

@RestController
@CrossOrigin("*")
public class ReviewController {
	
	 @Autowired
	 ReviewService reviewservice;
	 
	 @RequestMapping(method=RequestMethod.POST, value="/review")
	    public String save(@RequestBody Review review) {
		 reviewservice.save(review);
	     return review.getId();
	    }

	 @RequestMapping(method=RequestMethod.GET, value="/review/{id}")
	    public Review findById(@PathVariable String id) {
	        return reviewservice.findOne(id);
	    }
	 
	 @RequestMapping(method=RequestMethod.GET, value="/reviews")
	    public Iterable<Review> findAllReviews() {
	        return reviewservice.findAll();
	    }

	 @RequestMapping(method=RequestMethod.PUT, value="/review/{id}")
	    public Review updateReview(@PathVariable String id,@RequestBody Review review) {
		 	Review r = reviewservice.findOne(id);
		 	if(review.getBookName()!=null)
		 		r.setBookName(review.getBookName());
		 	if(review.getComments()!=null)
		 		r.setComments(review.getComments());
		 	if(review.getLikes()!=0)
		 		r.setLikes(review.getLikes());
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
	        return reviewservice.save(r);
	    }
}
