<!DOCTYPE html>
<html>
<body>
<form method="post" action="">
Enter Username:
<input type="text" name="t1">
<input type="submit">
</form>
</body>
</html>

<%-- Accet Username and Greets according To User --%>
<%@page language="java"%>
<%@ page import="java.util.*"%>
<%
 String s1=request.getParameter("t1");
 if(s1!=null)
 {
	 Date d1=new Date();
	 out.println("<h1>Date &Time="+d1);
	 int hr=d1.getHours();
	 if(hr>=12&&hr<=16)
	 out.println("<h2>Good Afternoon"+s1);
	 else if(hr>=17&&hr<=20)
		 out.println("<h2>Good Evening"+s1);
	 else if(hr>=21&&hr<=24)
		 out.println("<h2>Good Night"+s1);
	 else
		 out.println("<h2>Good Morning"+s1); 
 }
%>