<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//로그아웃 처리 (세션 초기화)
session.invalidate();

//response.sendRedirect("loginForm.jsp");
%>

<script>
alert('로그아웃 되었습니다.');
location.href = 'loginForm.jsp';
</script>