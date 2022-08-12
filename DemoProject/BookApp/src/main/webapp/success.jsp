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
String title=(String)request.getAttribute("Title");
out.print("My Title is:"+request.getAttribute("Title")+"<br>");

Integer id=(Integer)request.getAttribute("BookId");
out.print("My BookId is:"+id+"<br>");
out.print("Author name  is:"+request.getAttribute("Author")+"<br>");
out.print("The Category  is:"+request.getAttribute("Category")+"<br>");

Double price=(Double)request.getAttribute("Price");
out.print("MyTitle is:"+price+"<br>");

%>

</body>
</html>