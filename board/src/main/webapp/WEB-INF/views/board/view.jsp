<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
 <title>lake 게시판</title>
</head>
<body>

<div id="root">
<header>
		<%@include file="include/header.jsp" %>
	</header>
	<hr />
	<nav>
		<%@include file="include/nav.jsp" %>
	</nav>

<hr />

 <section id="container">
 
  <form role="form" method="post" autocomplete="off">
   <p>
    <label for="title">글 제목</label> : ${view.title}
   </p>
   <p>
    <label for="content">글 내용</label> : ${view.content}
   </p>
   <p>
    <label for="writer">작성자</label> : ${view.writer}
   </p>
   <p>
   	<a href="/board/modify?bno=${view.bno}">게시물 수정</a>
   	<a href="/board/delete?bno=${view.bno}">게시물 삭제</a>
   	<a href="/board/list">리스트로 되돌아가기</a>
   	<a href="../">홈화면(시계)</a>
<!-- <button type="submit">작성</button> -->    
   </p>  
  </form>

 </section>
 
<hr />
	<footer>
		<%@include file="include/footer.jsp" %>
	</footer>

</div>

</body>
</html>