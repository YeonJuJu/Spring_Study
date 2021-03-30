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
    <h1>Test 4</h1>
    <form:form action="result" modelAttribute="test4DTO">
    	이 름:<form:input path="name"/><br>
    	아이디:<form:input path="id"/><br>
    	비밀번호:<form:password path="pw" shoPassword="true"/><br>
    	우편번호:<form:input path="postcode"/><br>
    	주소 1:<form:input path="addr1"/><br>
    	주소 2:<form:input path="addr2"/><br>
    	<button>확인</button>
    </form:form>
</body>
</html>