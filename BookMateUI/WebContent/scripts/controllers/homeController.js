app.controller("homeController",function($scope,$http,$location,loginService,reviewService){
	$scope.message = "Welcome " + loginService.getUsername();
	
	 $scope.books = [];
	    $scope.GetData =function(){
	       $http.get('http://localhost:8080/reviews').then(function(data) {
	    	  $scope.books = data.data;;
	          console.log($scope.books)
	      },function(error) {
	        $scope.error = error;
	      })
	    }
	 
	 $scope.GetData();
	 
	$scope.submit = function(event){
		reviewService.setMessage(event.target.innerText);
		reviewService.setId(event.target.id);
		$location.path("/review");
	}
})