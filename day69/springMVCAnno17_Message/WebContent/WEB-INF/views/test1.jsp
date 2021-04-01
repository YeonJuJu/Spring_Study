<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" 
   uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SPRING</title>
</head>
<body>
	<h1>test1</h1>    
	<h3>tjoeun1.t1 : <spring:message code="tjoeun1.t1"/></h3>
	<h3>tjoeun2.t2 : <spring:message code="tjoeun2.t2"/></h3>
	<h3>tjoeun1.t2 : <spring:message code="tjoeun1.t2" arguments="${requestScope.arrObj}"/></h3>
	<h3>tjoeun3.t3 : <spring:message code="tjoeun3.t3"/></h3>
</body>
</html>