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
    <h1>Test 1</h1>
    <form action="result" method="post">
    	이 름:<input type="text" name="name" value="${ requestScope.memberDTO.name}"><br>
    	아이디:<input type="text" name="id" value="${ requestScope.memberDTO.id}"><br>
    	비밀번호:<input type="password" name="pw" value="${ requestScope.memberDTO.pw}"><br>
    	우편번호:<input type="text" name="postcode" value="${ requestScope.memberDTO.postcode}"><br>
    	주소 1:<input type="text" name="addr1" value="${ requestScope.memberDTO.addr1}"><br>
    	주소 2:<input type="text" name="addr2" value="${ requestScope.memberDTO.addr2}"><br>
    	<button>확인</button>
    </form>
</body>
</html>