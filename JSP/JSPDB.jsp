<html>
<body>
<form method="post" action="">
Enter Emp No-
<input type="number" name="t1"><br>
Enter Emp Name-
<input type="text" name="t2"><br>
Enter Emp Sal-
<input type="text" name="t3"><br>
<input type="submit">
</form>
</body>
</html>
<%@page language="java"%>
<%@page import="java.sql.*"%>
<%
String s1=request.getParameter("t1");
String s2=request.getParameter("t2");
String s3=request.getParameter("t3");
if(s1!=null&&s2!=null&&s3!=null)
{
	int eno=Integer.parseInt(s1);
	int sal=Integer.parseInt(s3);
	try
	{
		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql:bharat","postgres","root");
		String s="insert into emp values(?,?,?)";
		PreparedStatement pst=con.prepareStatement(s);
		pst.setInt(1,eno);
		pst.setString(2,s2);
		pst.setInt(3,sal);
		pst.executeUpdate();
		out.println("<h1>Record Insert Sucessfully");
	}catch(Exception e)
	{
		out.println("Error"+e);
	}
}
%>