package com.bookmate.restapi.models;

 import org.springframework.data.mongodb.core.mapping.DBRef;
 
 public class Comment {
	
	@DBRef
    User user;
	String comment;
    
    public Comment(){
    	
    }
    
    public Comment(User user,String comment){
    	this.user = user;
    	this.comment = comment;
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

	

}
