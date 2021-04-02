<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SPRING</title>
</head>
<body>
    <h1>input_data</h1>
    <form:form action="input_Proc" modelAttribute="dataDTO1" method="post">
    	name : <form:input path="name"/>
		       <form:errors path="name"/>
		       <br>
    	
    	addr : <form:input path="addr"/>
		       <form:errors path="addr"/>
		       <br>
		       
		email : <form:input path="email"/>
		       <form:errors path="email"/>
		       <br>
    	<form:button type="submit">확인</form:button>
    </form:form>
</body>
</html>