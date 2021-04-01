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
	<h1>input_data2</h1>
	<form action="input2Proc" method="post">
		data3 : <input type="text" name="data3"><br>
		<spring:hasBindErrors name="dataDTO2">
    		<c:if test="${errors.hasFieldErrors('data3')}">
    			<%-- ${errors.getFieldError('data3').defaultMessage}<br> --%>
    			<spring:message code="${errors.getFieldError('data3').codes[0]}"></spring:message><br>
    		</c:if>
    	</spring:hasBindErrors>
		data4 : <input type="text" name="data4"><br>
		<spring:hasBindErrors name="dataDTO2">
   		<c:if test="${errors.hasFieldErrors('data4')}">
   			<%-- ${errors.getFieldError('data4').defaultMessage}<br> --%>
   			<spring:message code="${errors.getFieldError('data4').codes[0]}"></spring:message><br>
    	</c:if>
    	</spring:hasBindErrors>
		
		<button>확인</button>
	</form>    
</body>
</html>