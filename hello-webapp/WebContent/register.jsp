<%@ page import="java.sql.*, java.util.*" %>

<jsp:useBean id="service" class="com.demo.service.EmployeeService" />
<jsp:useBean id="emp" class="com.demo.model.Employee" />
<jsp:setProperty name="emp" property="*" />

<%
/*
	String fname = request.getParameter("firstname");
	String lname = request.getParameter("lastname");
	double sal = Double.parseDouble(request.getParameter("salary"));
	
	emp.setFirstname(fname);
	emp.setLastname(lname);
	emp.setSalary(sal);
	*/
	int x = service.insert(emp);
	if(x > 0)
%>
		<h3>
<%
		out.println("Inserted...!");
%>
		</h3>