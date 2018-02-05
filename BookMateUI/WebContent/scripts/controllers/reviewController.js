app.controller("reviewController",function($scope,$http,$location,reviewService){
	$scope.message = reviewService.getMessage();
	
	$scope.book = [];
    $scope.GetData =function(){
       $http.get('http://localhost:8080/review/'+reviewService.getId()).then(function(data) {
    	  $scope.book = data.data;
    	  $scope.rate = data.data.ratings.toString();
      },function(error) {
        $scope.error = error;
      })
    }
 
    $scope.GetData();
    
    $scope.submit = function(event){
    	console.log(event.target.id);
    }
    
    $scope.updateRate = function(){
    	console.log($scope.rate);
    	reviewService.saveRate($scope.book,$scope.rate);
    }
    
    $scope.likeComment = function(event){
    	console.log(event.target.id)
    	reviewService.likeComment($scope.book,event.target.id)
    }
    
    $scope.addComment = function(){
    	reviewService.addComment($scope.book,$scope.comment)
    }
})