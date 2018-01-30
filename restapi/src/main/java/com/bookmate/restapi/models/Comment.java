package com.bookmate.restapi.models;

 import org.springframework.data.mongodb.core.mapping.DBRef;
 
 public class Comment {
	
	@DBRef
    User user;
	String comment;
	int likes;
    
    public Comment(){
    	
    }
    
    public Comment(User user,String comment,int likes){
    	this.user = user;
    	this.comment = comment;
    	this.likes = likes;
    }
    
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	

}
