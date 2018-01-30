package com.bookmate.restapi.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "review") 
public class Review {
	@Id
    String id;
    String bookName;
    String author;
    String publisher;
    String genre;
    float ratings;
    String review;
    String image;
    List<Comment> comments;
    
    @DBRef
    User user;
    
    Review(){
    	
    }
    
    public Review(String bookName,String author,String publisher,String genre,float ratings,String review,String image,List<Comment> comments,User user){
    	this.bookName = bookName;
    	this.author = author;
    	this.publisher = publisher;
    	this.review = review;
    	this.image = image;
    	this.comments = comments;
    	this.user = user;
    	this.genre = genre;
    	this.ratings = ratings;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	    
}
