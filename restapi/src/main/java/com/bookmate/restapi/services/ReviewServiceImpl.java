package com.bookmate.restapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookmate.restapi.models.Comment;
import com.bookmate.restapi.models.Review;
 import com.bookmate.restapi.repositories.ReviewRepository;
 import java.util.UUID;

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
		if(r.getComments()!=null){
	 		List<Comment> l = r.getComments();
	 		UUID idOne = UUID.randomUUID();
	 		for(int i=0;i<l.size();i++){
	 			System.out.println(l.get(i).getComment());
	 			if(l.get(i).getId()==null){
	 				System.out.println(idOne);
	 				l.get(i).setId(idOne.toString());
	 			}
	 		}
	 		r.setComments(l);
	 	}
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
	 	if(review.getComments()!=null){
	 		List<Comment> l = review.getComments();
	 		UUID idOne = UUID.randomUUID();
	 		for(int i=0;i<l.size();i++){
	 			System.out.println(l.get(i).getComment());
	 			if(l.get(i).getId()==null){
	 				System.out.println(idOne);
	 				l.get(i).setId(idOne.toString());
	 			}
	 		}
	 		r.setComments(l);
	 	}
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
	 	repository.save(r);
		return r;
	}

	@Override
	public List<String> getDistinctCategories() {
		return repository.getDistinctCategories();
	}

}
