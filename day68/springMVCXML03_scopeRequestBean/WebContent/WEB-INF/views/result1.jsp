<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SPRING</title>
</head>
<body>
    <h1>result1</h1>
    <h3>이름 : ${requestScope.requestDto1.name }</h3>
    <h3>별명 : ${requestScope.requestDto1.alias }</h3>
	<h3>주소 : ${requestScope.requestDto2.addr }</h3>
    <h3>전화번호 : ${requestScope.requestDto2.phone }</h3>
	<h3>직업 : ${requestScope.requestDto3.job }</h3>
    <h3>취미 : ${requestScope.requestDto3.hobby }</h3>
    <h3>주민번호 : ${requestScope.requestDto4.psn }</h3>
    <h3>운전번호 : ${requestScope.requestDto4.dl }</h3>
</body>
</html>