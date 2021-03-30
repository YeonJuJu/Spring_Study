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
    <h2>Hello Spring !!</h2>
    <button onClick="location.href='test1'">test1 - get</button>
    <form action="test1" method="post">
    	<button onClick="location.href='test1'">test1 - post</button>
    </form>
    <button onClick="location.href='test2'">test2 - get</button>
    <form action="test2" method="post">
    	<button onClick="location.href='test2'">test2 - post</button>
    </form>
    <button onClick="location.href='test3'">test3 - get</button>
    <form action="test3" method="post">
    	<button onClick="location.href='test3'">test3 - post</button>
    </form>
    <button onClick="location.href='test4'">test4 - get</button>
    <form action="test4" method="post">
    	<button onClick="location.href='test4'">test4 - post</button>
    </form>
</body>
</html>