<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
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


<a href="./board/list">게시물 목록</a>
<a href="./board/write">게시물 작성</a><br><br>

<label>아이디 : </label><input type=text name="id" id="id" placeholder="아이디" /><br>
<label>비밀번호 : </label><input name="pw" id="pw" placeholder="비밀번호" /><br><br>

<input type=button value="로그인" />
<a href="./board/join"><input type=button value="회원가입" /></a>

</body>
</html>
