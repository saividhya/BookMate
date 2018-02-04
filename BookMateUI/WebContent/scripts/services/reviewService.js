app.service("reviewService",function($http){
	var message="",id="";
	this.setMessage = function(x){
		message = x
	}
	this.getMessage = function(){
		return message
	}
	this.setId = function(x){
		id = x
	}
	this.getId = function(){
		return id
	}
})