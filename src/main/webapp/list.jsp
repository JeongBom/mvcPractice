<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록</title>
</head>
<body>
 <h2>회원 목록</h2>
    <table border="1">
        <tr><th>이름</th></tr>
        <c:forEach var="name" items="${list}">
            <tr><td>${name}</td></tr>
        </c:forEach>
    </table>
    <a href="index.jsp">입력 화면으로</a>
</body>
</html>