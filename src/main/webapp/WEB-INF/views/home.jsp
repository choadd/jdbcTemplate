<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" isELIgnored="false" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<a href="/">추가하기</a>
		
	
		<c:forEach var="result" items="${list}">
			<tr>
				<th>결과는?</th>
				<td>${result.result }</td>
			</tr>
			<tr>
				<th>키는?</th>
				<td>${result.cm }</td>
			</tr>
			<tr>
				<th>몸무게는?</th>
				<td>${result.kg }</td>
			</tr>
			<tr>
				<th>나이는?</th>
				<td>${result.age }</td>
			</tr>
			<tr>
				<th>비율은?</th>
				<td>${result.rate }</td>
			</tr>
			<td>--------------------------</td>
		</c:forEach>

	</table>
</body>
</html>