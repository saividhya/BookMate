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
	this.saveRate = function(b,x){
		var data = b
		data.ratings = x
		$http({method: 'PUT',
	           url: 'http://localhost:8080/review/'+b.id,
	           data: data,
	           cache:false,
	           headers: {
	                'Access-Control-Allow-Origin': '*',
	                'Access-Control-Allow-Methods': 'GET, POST, PUT, DELETE, OPTIONS',
	                'Access-Control-Allow-Headers': 'Content-Type, X-Requested-With',
	                'X-Random-Shit':'123123123'
	            }})
	            .success(function(outputData) {
	            	console.log("succes");
	    }).error(function(outputData){
	    	console.log("error");
	    });
	}
	
	this.likeComment = function(b,x){
		var data = b
		for (var i = 0; i < data.comments.length; i++){
			if(data.comments[i].id == x)
			{
			    data.comments[i].likes = data.comments[i].likes +1;
			  }
			}
		$http({method: 'PUT',
	           url: 'http://localhost:8080/review/'+b.id,
	           data: data,
	           cache:false,
	           headers: {
	                'Access-Control-Allow-Origin': '*',
	                'Access-Control-Allow-Methods': 'GET, POST, PUT, DELETE, OPTIONS',
	                'Access-Control-Allow-Headers': 'Content-Type, X-Requested-With',
	                'X-Random-Shit':'123123123'
	            }})
	            .success(function(outputData) {
	            	console.log("succes");
	    }).error(function(outputData){
	    	console.log("error");
	    });
	}
	
	this.addComment = function(b,x){
		var data = b
		data.comments.push({"comment":x});
		$http({method: 'PUT',
	           url: 'http://localhost:8080/review/'+b.id,
	           data: data,
	           cache:false,
	           headers: {
	                'Access-Control-Allow-Origin': '*',
	                'Access-Control-Allow-Methods': 'GET, POST, PUT, DELETE, OPTIONS',
	                'Access-Control-Allow-Headers': 'Content-Type, X-Requested-With',
	                'X-Random-Shit':'123123123'
	            }})
	            .success(function(outputData) {
	            	console.log("succes");
	    }).error(function(outputData){
	    	console.log("error");
	    });
	}
})