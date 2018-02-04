package com.bookmate.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bookmate.restapi.models.Review;
import com.bookmate.restapi.services.ReviewService;

@CrossOrigin(origins = { "http://localhost:8000" }, maxAge = 3000)
@RestController
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
		 	return reviewservice.updateReview(id,review);
	    }
	 
	 @RequestMapping(method=RequestMethod.GET, value="/categories")
	    public List<String> getDistinctCategories() {
	        return reviewservice.getDistinctCategories();
	    }
}
