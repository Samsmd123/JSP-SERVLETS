<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"   import="com.healthapp.model.Plan"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- <%Plan plan=(Plan) request.getAttribute("plan"); %>
PlanName<%=plan.getPlanName() %><br>
Coverage<%=plan.getCoverage() %><br>
Brand<%=plan.getCoverage() %><br>
SumInsured<%=plan.getSumInsured() %><br>
Category<%=plan.getCategory() %><br> --%>

<h1> Using Expression Language</h1>
PlanName: ${plan.planName}<br>
Category: ${plan.category}<br>
Brand: ${plan.brand}<br>
SumInsured: ${plan.sumInsured}<br>
coverage: ${plan.coverage}<br>

</body>
</html>