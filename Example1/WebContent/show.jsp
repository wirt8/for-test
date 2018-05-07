<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page import="copy.models.Student" %>
<%@ page import="java.util.List" import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table style="width:50%">
		<tr>
			<th>Student</th>
			<th>ID</th>
		</tr>
		<c:forEach items="${sessionScope.students}" var="student">
    		<tr>
				<td>${student.name}</td>
				<td>${student.id }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>