app.service("loginService",function($http){
	var username = "",password="",message="";
	this.setUsername = function(x){
		username = x;
	}
	this.getUsername = function(){
		return username;
	}
	this.setPassword = function(x){
		password = x;
	}
	this.getPassword = function(){
		return password;
	}
	this.setMessage =  function(x){
		message = x
	}
	this.getMessage = function(){
		return message
	}
	this.save = function(){
		
	}
})