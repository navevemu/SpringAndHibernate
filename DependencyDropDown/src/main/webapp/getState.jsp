
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Map" %>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="Dao.StatesDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
StatesDao s=new StatesDao();
List<String> snames=new ArrayList<String>();
Map<String,String> m=s.getStatesByCountry("");
String s1=$_POST["country_id"];
//System.out.println(snames.isEmpty());
if(s1!=null){
List<String> s2=new ArrayList<String>();
for(Map.Entry m1:m.entrySet()){  
	if(s1==m1.getValue().toString())
	  s2.add(m1.getKey().toString());
	  }

for(int i=0;i<s2.size();i++)
{
	
%>
<option value="<%= s2.get(i)%>"> <%=s2.get(i)%></option>

<%}} %>


</body>
</html>