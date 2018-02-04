package com.bookmate.restapi.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.convert.QueryMapper;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.bookmate.restapi.models.Review;
import com.mongodb.BasicDBObject;

@Repository
public class ReviewRepositoryImpl implements ReviewRepository {

private static final String COLLECTION = "review";
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	@Override
	public Review findOne(String id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(id));
		return mongoTemplate.find(query,Review.class).get(0);
	}

	@Override
	public Review save(Review review) {
		if (review != null) {
		   this.mongoTemplate.insert(review, COLLECTION);
		  }
		return review;
	}

	@Override
	public List<Review> findAll() {
		Query query = new Query();
		return mongoTemplate.find(query,Review.class);
	}

	
	@Override
	public  List getDistinctCategories() {
		return mongoTemplate.getCollection(COLLECTION).distinct("genre");
	}

}
