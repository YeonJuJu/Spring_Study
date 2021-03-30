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
    <h1>test2</h1>
    <form:form action="test2" modelAttribute="dataDTO" method="get">
    	 <form:select path="str1">
    	 <!-- 컨트롤러에서 str1을 민윤기로 지정했기 때문에 이 화면에서는 민윤기가 디폴트 값으로 보여지게 된다. -->
    	 	<form:option value="김석진">김석진</form:option>
    	 	<form:option value="민윤기">민윤기</form:option>
    	 	<form:option value="정호석">정호석</form:option>
    	 </form:select>
    </form:form>
</body>
</html>