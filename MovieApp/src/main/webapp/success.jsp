<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
out.print("Welcome :"+request.getAttribute("username")+"<br>");
%>
<form action="movieServlet">
Choose the language of movie<select name="language"><br>
<option value="select">-------select------------</option>
<option value="english">English</option>
<option value="hindi">Hindi</option>
<option value="telugu">Telugu</option>
<option value="tamil">Tamil</option>
<option value="malyalam">Malyalam</option>
<input type="submit" value="showmovies"><br>

</form>

</select><br>
</body>
</html>