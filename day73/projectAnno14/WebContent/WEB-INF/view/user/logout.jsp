<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 절대 경로 설정 -->
<%-- <c:url var="root" value="${pageContext.request.contextPath }/" /> --%>
<c:set var="root" value="${pageContext.request.contextPath }/" />
<script type="text/javascript">
  alert('로그아웃 되었습니다');
</script> 
<%
  response.sendRedirect("/");
%>



