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
    <h1>test3</h1>
    <form:form action="test3" modelAttribute="dataDTO" method="get">
    	 <form:select path="str2">
    	 	<form:options items="${requestScope.list_str}"/>
    	 </form:select>
    </form:form>
</body>
</html>