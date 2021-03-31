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
    <h3>name : ${requestScope.sessionDTO1.name}</h3>
    <h3>alias : ${requestScope.sessionDTO1.alias}</h3>
    <h3>addr : ${requestScope.sessionDTO2.addr}</h3>
    <h3>phone : ${requestScope.sessionDTO2.phone}</h3>
    <h3>job : ${requestScope.sessionDTO3.job}</h3>
    <h3>hobby : ${requestScope.sessionDTO3.hobby}</h3>
    <h3>psn : ${requestScope.sessionDTO4.psn}</h3>
    <h3>dl : ${requestScope.sessionDTO4.dl}</h3>
</body>
</html>