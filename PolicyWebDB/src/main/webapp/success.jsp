<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="com.policywebdb.model.Policy"s%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%Policy policy=(Policy) request.getAttribute("policy"); %>
PolicyNumber:<%=policy.getPolicyNumber%><br>
PolicyName:<%=policy.getPolicyName() %><br>
Premum
Coverage<%=policy.getCoverage() %><br>
Brand<%=policy.getCoverage() %><br>
SumAssured<%=policy.get%><br>
Category<%=policy.getCategory() %><br>
</body>
</html>