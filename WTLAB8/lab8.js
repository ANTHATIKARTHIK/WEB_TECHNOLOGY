var myApp = angular.module('lab8', []);
myApp.controller('MyController', function ($scope) {
    $scope.table = false;
    $scope.card = false;
    $scope.func = function () {
        if ($scope.layout == "Bootstrap Table") {
            $scope.table = true;
        }
        if ($scope.layout == "Bootstrap Card") {
            $scope.card = true;
        }
        //console.log($scope.layout == "Bootstrap Card");
        //console.log($scope.table);

    };
});
