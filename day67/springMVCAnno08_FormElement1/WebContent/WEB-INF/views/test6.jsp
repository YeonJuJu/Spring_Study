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
    <h1>test6</h1>
    <form:form action="result" modelAttribute="dataDTO">
		    <form:checkbox path="str5" value="전정국"/>이름1
		    <form:checkbox path="str5" value="김태형"/>이름2
		    <form:checkbox path="str5" value="박지민"/>이름3
    </form:form>
</body>
</html>