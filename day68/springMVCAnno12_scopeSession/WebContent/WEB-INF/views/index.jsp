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
    <h1>Hello Spring ~</h1>
    <button onClick="location.href='test1'">test1</button>
    <button onClick="location.href='test2'">test2 redirect:/result1</button>
    <button onClick="location.href='test3'">test3 forward:/result1</button>
    <button onClick="location.href='result1'">result1</button>
    
    <hr><br>
    <button onClick="location.href='test4'">test4</button>
    <button onClick="location.href='result4'">result4</button>
    <button onClick="location.href='result5'">result5</button>
    
    <hr><br>
    <button onClick="location.href='test6'">test6</button>
    <button onClick="location.href='result6'">result6</button>
</body>
</html>