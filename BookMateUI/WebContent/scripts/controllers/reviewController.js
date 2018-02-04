app.controller("reviewController",function($scope,$http,$location,reviewService){
	$scope.message = reviewService.getMessage();
	
	$scope.book = [];
    $scope.GetData =function(){
       $http.get('http://localhost:8080/review/'+reviewService.getId()).then(function(data) {
    	  $scope.book = data.data;
      },function(error) {
        $scope.error = error;
      })
    }
 
    $scope.GetData();
 
 
})