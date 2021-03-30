<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" 
   uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SPRING</title>
</head>
<body>
    <h1>test5</h1>
    <form:form action="result" modelAttribute="dataDTO" method="get">
    	 <form:select path="str4">
    	 	<form:options items="${requestScope.list_data}"
    	 	itemLabel="key" itemValue="value"/>
    	 </form:select>
    </form:form>
</body>
</html>