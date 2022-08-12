<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="resgistorsservlet" method="post" >
Enter Name<input type="text" name="name" ><br>
Enter Student_Id <input type="number"  name="stud_Id" ><br>
Enter City<input type="text"   name="city"><br>
Choose language<select name="language"><br>
<option value="select">----select--------</option>
<option value="css">css</option>
<option value="java">java</option>
<option value="Hibernet">Hibernet</option>
<option value="spring">spring</option>

</select><br>
Enter Hobby
<input type="checkbox" value="music" name="hobby">Music
<input type="checkbox" value="sports" name="hobby">Sports

<input type="checkbox" value="dance" name="hobby">Dance
<input type="checkbox" value="readng" name="hobby">Reading<br>

<input type="submit"  value="Add"><br>
</form>
</body>
</html>