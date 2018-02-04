var app = angular.module("mainApp", ['ui.bootstrap','ngRoute']);
 
app.config(['$routeProvider',
  function($routeProvider) {
     $routeProvider
	     .when('/login', {
            templateUrl: 'login.html',
            controller: 'loginController'
        })
        .when('/register', {
            templateUrl: 'register.html',
            controller: 'registerController'
        })
        .when('/home', {
            templateUrl: 'home.html',
            controller: 'homeController'
        })
        .when('/review', {
            templateUrl: 'review.html',
            controller: 'reviewController'
        })
        .otherwise({
            redirectTo: '/login'
        });
}]);
