<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration </title>
</head>
<body>
<%
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","naveen","naveen");
PreparedStatement ps=con.prepareStatement("select qualification from qualifications");
ResultSet rs=ps.executeQuery();



%>
<form action="./reg.jsp" method="get">
<pre>>
Student-ID:<input type="text" name="id">
Student-Name:<input type="text" name="sname">
Email:<input type="text" name="email">
Qualification:<select name="qu">
<%while(rs.next()){
	String ss= rs.getString(1);
	%>
	<option value= "<%= ss %>" ><%=ss %></option> 
	<%
	} 
 %>
</select>
<input type="submit" value="Submit">

</pre>
</form>
</body>
</html>