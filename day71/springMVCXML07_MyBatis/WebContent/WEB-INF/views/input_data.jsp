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
    <h1>input_data</h1>
    <form action="input_proc" method="post">
    	이름 : <input type="text" name="name"><br>
    	아이디 : <input type="text" name="id"><br>
    	비밀번호 : <input type="password" name="passwd"><br>
    	<button>확인</button>
    </form>
</body>
</html>