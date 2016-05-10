'use strict';

angular.module('phonebookApp').controller(
		'PhonebookCtrl',
		function($scope, $http) {
			var contacts = [];
			$scope.getContacts = function(val) {

				return $http.get(
						'http://localhost:8080/phonebook/rest/services/search/'
								+ val).then(function(res) {
					//    			    
					// if(res.data.length > 0) {
					// angular.forEach(res.data, function(item){
					// contacts.push(item);
					// });
					// }
					return res.data;
				});
			}
		});