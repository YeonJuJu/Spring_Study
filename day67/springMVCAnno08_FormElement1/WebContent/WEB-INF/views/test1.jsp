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
    <h1>test1</h1>
    <form:form action="test1" modelAttribute="infoDTO" method="get">
    	<form:hidden path="name"/>
    	아이디    : <form:input path="id"/><br>
    	비밀번호 : <form:password path="pw" showPassword="true"/><br>
    	컨텐츠    : <form:textarea path="content"/><br>
    	<form:button disabled="true">확인</form:button>
    </form:form>
</body>
</html>