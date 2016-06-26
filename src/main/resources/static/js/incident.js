'use strict';
var incidentModule = angular.module('incidentApp', ['ngRoute','ui.bootstrap.datetimepicker']);

incidentModule.config(['$routeProvider', '$locationProvider',
    function($routeProvider,$locationProvider)
    {
        $routeProvider.
        when('/',
            {
                templateUrl: 'admin/home.html',
            }).
        when('/referral',
            {
                templateUrl: 'referral',
                controller: 'refCtrl'
            }).
        when('/menu',
            {
                templateUrl: 'menu',
            }).
        when('/incidentList',
            {
                templateUrl: 'incident/incidentList.html',
            }).
        when('/preDeparture',
            {
                templateUrl: 'incident/PreDeparture.html',
                controller: 'depCtrl'
            }).
        when('/center',
            {
                templateUrl: 'center',
                controller: 'centerController'
            }).
        when('/medicalHistory',
            {
                templateUrl: 'incident/MedicalHistory.html',
                controller: 'medHistoryController'
            }).
        when('/plan',
            {
                templateUrl: 'plan/plan.html',
                controller:'centerController'
            }).
        when('/medicalProfessionals',
            {
                templateUrl: 'admin/StaffAdmin.html',
                controller:'adminCtrl'
            }).
        when('/incident/:key',
            {
                templateUrl: 'incident/incident.html',
            });
        $locationProvider.html5Mode(false).hashPrefix('!');
    }]
);

incidentModule.controller("incidentController", function incidentController($scope, $http, $location, $window,$routeParams) {

    $scope.selectedKey = $routeParams.key;
    $scope.onLoad = function()
    {
        $http.get("incidentData?key=" +$scope.selectedKey).success(
            function(response)
            {
                $scope.centers = response.centers;
                $scope.incident=response.incidentDTO;
            }
        );
    }
    $scope.addRecord = function () {
        $http.post("addIncident", $scope.incident)
            .then(
                function (response) {
                    $scope.content = response.data;
                    $window.location = "home";
                }
            );
    };
});

/* Referral Controller*/
incidentModule.controller("refCtrl", function($scope, $http,$window) {
    $scope.dto = new Object();
    $scope.dto.referral = new Object();
    $scope.dto.referral.refDate = new Date();
    $scope.selectedKey =0;

    $scope.onLoad = function()
    {
        alert('Loading data..........');
        $http.get("referralData?key=" +$scope.selectedKey).success(
            function(response)
            {
                $scope.centers = response.centers;
            }
        );
    };
    $scope.saveReferral = function () {
        alert('saving');
        $http.post('saveReferral',$scope.dto).success(
            function ()
            {
                $window.location = "home";
            }
        );
    };
    
});

/* End of referral controller */
incidentModule.controller("planCtrl", function($scope, $http) {
    $scope.plans = [];
    $scope.suggestedPlan = new Object();
    $scope.indications = [];
    $scope.indication = new Object();


    $scope.addPlan = function() {
        $http.post("addPlan", $scope.suggestedPlan).success(function(data) {
            $scope.getPlans();
        });
    };

    $scope.addIndication = function() {
        $http.post("addIndication", $scope.indication).success(function(data) {
            $scope.getIndications();
        });
    };


    $scope.getIndications = function() {
        $http.get('getIndications').success(function(data) {
            $scope.indications = data;
        });
    };

    $scope.getPlans = function() {
        $http.get('getAllPlans').success(function(data) {
            $scope.plans = data;
        });
    };

});

incidentModule.controller("medHistoryController", function($scope, $http, $window) {

    $scope.presentation = new Object();
    $scope.presentation.problemsList = [];
    $scope.presentation.medicationList = [];

    $scope.onAdd = function() {
        $scope.presentation.problemsList.push({});
    };

    $scope.removeProblem = function(index) {
        $scope.presentation.problemsList.splice(index, 1);
    };

    $scope.onAddMedication = function() {
        $scope.presentation.medicationList.push({});
    };

    $scope.removeMedication = function(index) {
        $scope.presentation.medicationList.splice(index, 1);
    };


    $scope.addRecord = function() {
        $http.post("addPresentation", $scope.presentation)
            .then(
                function(response) {
                    $scope.content = response.data;
                    $window.location = "#!menu";
                }
            );

    };

    //------------------ initial values ---------------------
    $scope.onAdd();
    $scope.onAddMedication()
});


incidentModule.controller("depCtrl", function ($scope, $http, $window) {
    $scope.departure = new Object();
    $scope.selectedCategoriesReceiving = [];
    $scope.receivingMedProfTypeKey=0;
    $scope.departure.receivingUnitTeam=[];
    $scope.referringUnitTeam =[];
    $scope.receivingUnitTeam=[];
    $scope.medProfTypes = [];

    $scope.receivingMedProfTypeChange = function(medProfCat)
    {
        medProfTypes.forEach(function(entry)
        {
            if (entry.primaryKey ==  medProfCat.medProfessionalType_key)
            {
                medProfCat.categories =entry.categories;
                return;
            }
        });
    };
    $scope.addReceivingUnitMember = function(index)
    {
        if (index ==1)
        {
            $scope.referringUnitTeam.push(new Object());
        }else {
            $scope.receivingUnitTeam.push(new Object());
        }

    };

    $scope.remove = function(index,type)
    {
        if (type ==1)
        {
            $scope.referringUnitTeam.splice(index,1);
        }else {
            $scope.referringUnitTeam.splice(index,1);
        }
    };

    $scope.saveDeparture = function () {
        var departureDTO = new Object();
        departureDTO.departure = $scope.departure;
        departureDTO.referringUnitProfessionals=[];
        $scope.referringUnitTeam.forEach(function(entry)
        {
            var medProfDTO = new Object();
            medProfDTO.name= entry.name;
            medProfDTO.categoryKey = entry.category_key;
            departureDTO.referringUnitProfessionals.push(medProfDTO);
        });

        departureDTO.receivingUnitProfessionals=[];
        $scope.receivingUnitTeam.forEach(function(entry)
        {
            var medProfDTO = new Object();
            medProfDTO.name= entry.name;
            medProfDTO.categoryKey = entry.category_key;
            departureDTO.receivingUnitProfessionals.push(medProfDTO);
        });

        $http.post("savePreDeparture",departureDTO)
            .then(
                function (response) {
                    alert('here');
                    $window.location = "/home";
                }
            );

    }
});

incidentModule.controller("centerController", function ($scope, $http) {

    $scope.selectedProvince = new Object();
    $scope.districtList = [];

    $scope.addCenter = false;
    $scope.showProvince = false;
    $scope.showNewDistrict = false;
    $scope.province = new Object();
    $scope.district = new Object();
    $scope.center = new Object();


    $scope.load = function()
    {
        $http.get("provinces").success(
            function(data)
            {
                $scope.provinces = data;
            }
        );
        $http.get("centers").success(
            function(data)
            {
                $scope.centers = data;
            }
        );
    }

    $scope.change = function () {
        $scope.districtList = [];
        $scope.provinces.forEach(function (province) {
            if (province.primaryKey == $scope.selectedProvince) {
                province.districts.forEach(function (district) {
                    $scope.districtList.push(district);
                });
            }
        });
    }

    $scope.saveProvince = function () {
        $http.post("saveProvince", $scope.province)
            .success(
                function (data) {
                    $scope.provinces = data;
                    $scope.province = new Object();
                }
            );

        $scope.showProvince = false;
    }

    $scope.saveDistrict = function () {
        $http.post("saveDistrict", $scope.district)
            .success(
                function (data) {
                    $scope.provinces = data;
                    $scope.district = new Object();
                }
            );

        $scope.showNewDistrict = false;
    }

    $scope.saveCenter = function () {
        $http.post("saveCenter", $scope.center)
            .success(
                function (data) {
                    $scope.centers = data;
                    $scope.addCenter =false;
                    $scope.center = new Object();
                }
            );
    }
});

incidentModule.controller("adminCtrl", function($scope,$http)
{
    $scope.medProfType = new Object();
    $scope.showMedProfPanel = false;

    $scope.medProfCategory = new Object();
    $scope.showCategory =false;

    $scope.onLoad = function()
    {
        $http.get("medProfData").success(
            function(response)
            {
                $scope.medProfTypes=response.medProfTypeDTOs;
                $scope.medProfCategories =response.medProfCategoryDTOs
            }
        );
    }
    $scope.saveMedProfType = function()
    {
        $http.post("saveMedProfType",$scope.medProfType).success(
            function(response)
            {
                $scope.medProfTypes=response;
            }
        );
    }

    $scope.saveCategory = function()
    {
        $http.post("saveCategory",$scope.medProfCategory).success(
            function(response)
            {
                $scope.medProfCategories=response;
            }
        );
    }

});


