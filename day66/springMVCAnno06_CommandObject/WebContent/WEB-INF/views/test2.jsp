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
    <h2>test2</h2>
    <h3>name : ${requestScope.test_data.name}</h3>
    <h3>id   : ${requestScope.test_data.id}</h3>
</body>
</html>