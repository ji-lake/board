<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
 <title>lake 게시판</title>
</head>
<body>

<div id="root">
 <header>
  <h1>lake 게시판</h1>
 </header>

<hr />
 
 <nav>
  처음화면 - 글쓰기 - 로그인
 </nav>

<hr />

 <section id="container">
 	<c:if test="${msg == null}">
	  <form role="form" method="post" autocomplete="off">
	   <p>
	    <label for="title">글 제목</label><input type="text" id="title" name="title" />
	   </p>
	   <p>
	    <label for="content">글 내용</label><textarea id="content" name="content"></textarea>
	   </p>
	   <p>
	    <label for="writer">작성자</label><input type="text" id="writer" name="writer" value="${member.userName}" readonly/>
	   </p>
	   <p>
	    <button type="submit">작성</button>
	   </p>  
	  </form>
	</c:if>
	
	<c:if test="${msg == false}">
		<p>글 작성은 회원만 하실 수 있습니다.</p>
	</c:if>
	
 </section>

<hr />

 <footer>
  <p>만든이 : lake</p>  
 </footer>

</div>

</body>
</html>