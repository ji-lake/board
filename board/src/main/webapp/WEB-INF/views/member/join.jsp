<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form role="form" method="post" autocomplete="off">
	<label>이름</label><br>
	<input type="text" name="userId" id=userId placeholder="이름" />
	<label>아이디</label><br>
	<input type="text" name="userName" id="userName" placeholder="아이디" />
	<label>비밀번호</label>
	<input type="text" name="userPass" id="userPass" placeholder="비밀번호" />
	<button type="submit" id="submit">가입</button>
</form>

</body>
</html>