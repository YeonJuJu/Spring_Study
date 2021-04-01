<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
	<form:form action="inputProc" modelAttribute="dataDTO1" method="post">
    
    	name : <form:radiobutton path="name" value="true" />true 
               <form:radiobutton path="name" value="false" />false<br>
			   <form:errors path="name" />
		       <br> 
     	age : <form:radiobutton path="age" value="true" />true 
	          <form:radiobutton path="age" value="false" />false<br>
			  <form:errors path="age" />
		      <br>     
		height: <form:input path="height" /><br>
           	    <form:errors path="height" /><br>
   		
   		weight: <form:input path="weight" /><br>
                <form:errors path="weight" /><br>
                
		hobby : <form:checkbox path="hobby" value="check1"/>check1<br>
			    <form:errors path="hobby" />
		        <br>   
		  
		colors : <form:checkbox path="colors" value="check2"/>check2<br>
			     <form:errors path="colors" />
		         <br>
		 
		number1 : <form:input path="number1"/>
		          <form:errors path="number1" />
		          <br>  
		          
		addr : <form:input path="addr"/>
		          <form:errors path="addr" />
		          <br>    		 
		<form:button type="submit">확인</form:button>
	</form:form>
</body>
</html>