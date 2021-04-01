<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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
    <form action="inputProc" method="post">
    	data1 : <input type="text" name="data1"><br>
    	<spring:hasBindErrors name="dataDTO1">
    		<c:if test="${errors.hasFieldErrors('data1')}">
    			${errors.getFieldError('data1').defaultMessage}<br>
    		</c:if>
    	</spring:hasBindErrors>
    	data2 : <input type="text" name="data2"><br>
    	<spring:hasBindErrors name="dataDTO1">
    		<c:if test="${errors.hasFieldErrors('data2')}">
    			${errors.getFieldError('data2').defaultMessage}<br>
    		</c:if>
    	</spring:hasBindErrors>
    	<button>확인</button>
    </form>
</body>
</html>