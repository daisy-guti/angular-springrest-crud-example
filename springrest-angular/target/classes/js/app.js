var app = angular.module('app', ['ngRoute','ngResource']);
app.config(function($routeProvider){
    $routeProvider
        .when('/employees',{
            templateUrl: '/views/employees.html',
            controller: 'employeeController'
        })
        .otherwise(
            { redirectTo: '/'}
        );
});
