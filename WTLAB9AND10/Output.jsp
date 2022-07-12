<html>

<head>
	<title>Lab Exercise-9</title>
</head>

<body>
    <%
    	String rollnumber =  request.getParameter("rollno");
        String dept = (String)request.getAttribute("department");
	%>	
	<h1>The Roll Number <%=rollnumber%> belongs to  <%=dept%> Department</h1>	
</body>

</html>