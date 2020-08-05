<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
 <title>lake 게시판</title>
</head>
<body>

<div id="root">
 <header>
  <h1>게시물 수정</h1>
 </header>

<hr />

<hr />

 <section id="container">
 
  <form role="form" method="post" autocomplete="off">
   <p>
    <label for="title">글 제목</label><input type="text" id="title" name="title" value="${view.title}"  />
   </p>
   <p>
    <label for="content">글 내용</label><input id="content" name="content" value="${view.title}" />
   </p>
   <p>
    <label for="writer">작성자</label><input type="text" id="writer" name="writer" value="${view.title}"  />
   </p>
   <p>
    <button type="submit">완료</button>
   </p>  
  </form>

 </section>

<hr />

 <footer>
  <p>만든이 : lake</p>  
 </footer>

</div>

</body>
</html>