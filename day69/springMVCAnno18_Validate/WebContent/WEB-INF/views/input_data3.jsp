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
	<h1>input_data3</h1>
	<form:form action="input3Proc" modelAttribute="dataDTO2" method="post">
		data3 : <form:input path="data3" type="text" /><br>
				<form:errors path="data3" /><br>
		
		data4 : <form:input path="data4" type="text" /><br>
		        <form:errors path="data4" /><br>
		
		<form:button type="submit">확인</form:button>
	</form:form>
</body>
</html>