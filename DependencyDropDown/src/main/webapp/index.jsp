<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Map" %>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="Dao.StatesDao"%>
<html>

<head>
<title>

Dependency Drop down list
</title>


</head>
<body>
<%
StatesDao s=new StatesDao();
List<String> s1=new ArrayList<String>();
Map<String,String> m=s.getStatesByCountry("");
//String s1=(String)request.getAttribute("countries");
//System.out.println(snames.isEmpty());

List<String> s2=new ArrayList<String>();
List<String> s3=new ArrayList<String>();
List<String> s4=new ArrayList<String>();

for(Map.Entry m1:m.entrySet()){  
	if(m1.getValue().toString().trim().equals("India"))
	  s2.add(m1.getKey().toString());
	else if(m1.getValue().toString().trim().equals("USA"))
		s3.add(m1.getKey().toString());
	else if(m1.getValue().toString().trim().equals("China"))
		s4.add(m1.getKey().toString());
	else 
		s1.add(m1.getKey().toString());
	  }
%>
<input  type="text" name="s1" id="s1" value="<%=s1.toString()%>">
<input  type="text" name="s2"  id="s2" value="<%=s2.toString()%>">
<input  type="text" name="s3"  id="s3" value="<%=s3.toString()%>">
<input  type="text" name="s4"  id="s4" value="<%=s4.toString()%>">
<form action="" method="post">
<table>

<tr>
<td>

<select id="countries" name="countries" onchange="filterList(value)">
<option> </option>
<option value="India">India</option>
<option value="USA">Usa</option>
<option value="China">China</option>
</select>
</td>
<td>
<select id="states" name="states">

<option></option>


</select>



<script type="text/javascript">
function filterList(value)
{
	
	var jsArray = [];
	
	
	alert(value);
	if(value=="India"){
		<%for(int i=0;i<s2.size();i++){%>
	    jsArray.push("<%= s2.get(i)%>");
	    <%}%>
	}
	else if(value=="USA"){
		<%for(int i=0;i<s3.size();i++){%>
	    jsArray.push("<%= s3.get(i)%>");
	    <%}%>
	}
	else if(value=="China"){
		<%for(int i=0;i<s4.size();i++){%>
	    jsArray.push("<%= s4.get(i)%>");
	    <%}%>
	}
	else if (value=="") {
		<%for(int i=0;i<s1.size();i++){%>
	    jsArray.push("<%= s1.get(i)%>");
	    <%}%>
	}

	alert(jsArray);
	     
	var sel = document.getElementById('states');
	for(var i = 0; i < jsArray.length; i++) {
	    var opt = document.createElement('option');
	    opt.innerHTML = jsArray[i];
	    opt.value = jsArray[i];
	    sel.appendChild(opt);
	}






}

</script>






</tr>



</table>


</form>
</body>











</html>