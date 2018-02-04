app.service("registerService",function($http){
	var username = "",email="",password="",message="";
	this.setUsername = function(x){
		username = x;
	}
	this.getUsername = function(){
		return username;
	}
	this.setEmail = function(x){
		email = x;
	}
	this.setPassword = function(x){
		password = x;
	}
	this.save = function(callback){
		var data = {}
		data.userName = username
		data.password = password
		data.email = email
		$http.post('http://localhost:8080/user', data).success(function(data,status) {
			message = "Successfully registered";
			callback(message);
		}).error(function(data, status) {
			message = "Error during registration";
			callback(message);
		});
		
	}
})