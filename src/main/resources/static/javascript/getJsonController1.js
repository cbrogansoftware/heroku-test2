var app = angular.module("mainApp", []);
// strict

app.controller('people', function ($scope, $http){

    //$http.get("javascript/people.json") // dummy json file for poc
    $http.get("getPeople") // now get from our Spring Boot app
        .then(function (response){
            //console.log(response.data.records);
            //console.log(response.data);

            //$scope.persons = response.data.records;
            $scope.persons = response.data;
        })
})