;<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="${pageContext.request.contextPath }/resources/js/angular.js"></script>
<script src="${pageContext.request.contextPath }/resources/js/app/currencyAngularApp.js"></script>

</head>


<body>
	<h1>Currency</h1>
	<div ng-app="currencyApp" ng-controller="CurrencyController">	
		<h2>{{companyName}}</h2>
		
		<ul>
			<li ng-repeat="(currencyBase, currencyRate) in rates"> 
				<label>  
					<span> {{currencyBase}} : {{currencyRate}} </span>
				</label>				
			</li>			
		</ul>
				
	</div>

</body>
</html>