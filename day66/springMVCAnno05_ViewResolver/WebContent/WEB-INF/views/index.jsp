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
    <h1>Hello Spring !!!</h1> <!-- parameter data : ModelAndView (에 담겨짐) -->
    <img alt="tree" src="images/tree.png">
    <button onClick="location.href='test1?data1=111&data2=222'">test1</button>
    <br><hr>
    <button onClick="location.href='test2'">test2</button>
    <br><hr>
    <button onClick="location.href='test3'">test3</button>
    <br><hr>
    <button onClick="location.href='test4'">test4</button>
</body>
</html>
