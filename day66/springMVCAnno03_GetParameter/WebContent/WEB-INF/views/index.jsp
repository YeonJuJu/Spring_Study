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
    <h2>HELLO SPRING !</h2>
    <!-- num3 넘기는 것과 같이 한 변수 이름으로 여러개의 값을 넘길 경우 배열로 넘어감 -->
    <button onClick="location.href='test1?num1=11&num2=22&num3=33&num3=55&num3=77'">test1 - get</button>
    
    <hr><br>
    
    <form action="test2" method="post">
    	이	름 : <input type="text" name="name"><br>
    	아 이 디  :<input type="text" name="id"><br>
    	취 	미 : <input type="checkbox" name="hobby" value="독서">독서
		    	<input type="checkbox" name="hobby" value="등산">등산
		    	<input type="checkbox" name="hobby" value="파티">파티
    	        <br>
    	<button>test2-post</button>         
    </form>
    <hr><br>
    
    <button onClick="location.href='test3?num1=11&num2=22&num3=33&num3=55&num3=77'">test3 - get</button>
	<hr><br>
	
	<button onClick="location.href='test4/111/222/333'">test4 - get</button>
	<hr><br>
	
	<button onClick="location.href='test5/111/222/333'">test5 - get</button>
	<hr><br>
	
	<button onClick="location.href='test6?num1=11&num2=22&num3=33&num3=55&num3=77'">test6 - get</button>
	<hr><br>
	
	<button onClick="location.href='test7?num1=11&num2=22&num3=33&num3=55&num3=77'">test7 - get</button>
	<hr><br>
	
	<!-- <button onClick="location.href='test8?num1=111&str2=hi'">test8</button>
	<hr><br> -->
	<button onClick="location.href='test8?num1=111'">test8</button>
	<hr><br>
</body>
</html>