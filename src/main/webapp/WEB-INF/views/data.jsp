<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="/data" method="get">
	 1번 값 <input type="text" name="sender" />
	 2번 값<input type="text" name="receiver" />
	 3번 값<input type="text" name="content" />
	 <input type="submit" value="제출">
	</form>
	
	
	<h4>${list.sender}</h4>
	<h4>${list.receiver}</h4>
	
	
</body>
</html>