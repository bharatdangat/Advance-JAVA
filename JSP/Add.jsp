<html>
<body>
<form method="post" action="#">
Enter First No-
<input type="text" name="t1">
Enter Second No-
<input type="text" name="t2">
<input type="submit">

</form>
</body>
</html>
<script>

document.write("<h1>Welcome");
</script>
<%
out.println("<script>");
out.println("confirm('Registration Sucessfull')");
out.println("</script>");

  String s1=request.getParameter("t1");
  String s2=request.getParameter("t2");
  if(s1!=null&s2!=null)
  {
	  int a=Integer.parseInt(s1);
	  int b=Integer.parseInt(s2);
	  int c=a+b;
	  out.println("<h1>Addition="+c);
  }
 
%>
