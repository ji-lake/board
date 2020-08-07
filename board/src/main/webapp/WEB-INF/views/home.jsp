<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>


<a href="/board/list">게시물 목록</a>
<a href="/board/write">게시물 작성</a><br><br>

<c:if test="${member == null}">
	<form role="form" method="post" autocomplete="off" action="/member/login">
		<label>아이디 : </label><input type="text" name="userId" id="userId" placeholder="아이디" /><br>
		<label>비밀번호 : </label><input type="password" name="userPass" id="userPass" placeholder="비밀번호" /><br><br>
		
		<button type="submit">로그인</button>
		<a href="/member/join"><input type="button" value="회원가입" /></a>
	</form>
</c:if>

<c:if test="${msg == false}">
	<p style="color:#foo;">로그인에 실패했습니다. 아이디 또는 패스워드를 다시 입력해 주십시오.</p>
</c:if>

<c:if test="${member != null}">
	<p>${member.userName}님 환영합니다.</p>
	<a href="/member/logout"><input type="button" value="로그아웃"></a>
</c:if>


</body>
</html>
