<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SPRING</title>
</head>
<body>
    <h1>read_data</h1>
    <c:forEach var="dto" items="${list}">
    	이름 : ${dto.name}<br>
    	아이디 :	${dto.id}<br>
    	비밀번호 :	${dto.passwd}<br>
    </c:forEach>
</body>
</html>