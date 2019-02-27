<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
int id=Integer.parseInt(request.getParameter("id"));
String sname=request.getParameter("sname");
String email=request.getParameter("email");
String qualification=request.getParameter("qu");
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","naveen","naveen");
PreparedStatement ps=con.prepareStatement("insert into Studentjsp values(?,?,?,?)");
ps.setInt(1, id);
ps.setString(2,sname);
ps.setString(3,email);
ps.setString(4,qualification);
int i=ps.executeUpdate();
if(i>0)
out.print("Registration sucess");
else
	out.print("Registration Fail");
%>
