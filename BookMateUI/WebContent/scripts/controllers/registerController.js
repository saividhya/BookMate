app.controller("registerController",function($scope,$location,registerService,loginService){
	$scope.register = function(){
		var email = $scope.email
		var uname = $scope.username
		var pwd = $scope.password
		registerService.setUsername(uname)
		registerService.setEmail(email)
		registerService.setPassword(pwd)
		registerService.save(function(x){
			loginService.setMessage(x);
		});
		$location.path("/login");
	}
	
	$scope.cancel = function(){
		$location.path("/login");
	}
	
})