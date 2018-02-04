app.controller("loginController",function($scope,$location,loginService){
	
	$scope.message = loginService.getMessage();
	
	$scope.submit = function(){
		var uname = $scope.username
		var pwd = $scope.password
		if(uname=="admin" && pwd=="admin"){
			loginService.setUsername(uname)
			loginService.setPassword(pwd)
			loginService.save()
			$location.path("/home");
		}else{
			$location.path("/login");
		}
	}
	
	$scope.register = function(){
		$location.path("/register");
	}
	
})
