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
    <h2>test1</h2>
    <!-- 이름을 지정하지 않으면 클래스 이름으로 자동 지정 되는데 첫글자는 소문자로 들어간다. 주의!! -->
    <!-- 이름을 지정하고 싶으면 컨트롤러에서 @ModelAttribute(이름) 으로 설정 -->
    <h3>name : ${requestScope.infoDTO.name }</h3>
    <h3>id  : ${requestScope.infoDTO.id }</h3>
</body>
</html>