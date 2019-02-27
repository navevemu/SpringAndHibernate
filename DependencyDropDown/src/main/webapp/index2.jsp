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
<script type="text/javascript">
function filterList(value)
{
var l=document.getElementById(list);
var c=value;
var pair=new Array();
pair=l.split("=");

alert(pair);



}

</script>

</head>
<body>
<%
StatesDao s=new StatesDao();
List<String> snames=new ArrayList<String>();
Map<String,String> m=s.getStatesByCountry("");

for(Map.Entry m1:m.entrySet()){  
	  snames.add(m1.getKey().toString());
	  }
%>
<input type="text" name="list" value="<%=m%>" id="list"> 
<form action="" method="post">
<table>
<tr>
<td>

<select id="countries" name="countries" onchange="getState(this.value);">
<option> </option>
<option value="India">India</option>
<option value="USA">Usa</option>
<option value="China">China</option>
</select>
</td>
<td>
<select id="states" name="states">

<option value=""></option>
</select>
<script>
function getState(val) {
	$.ajax({
	type: "POST",
	url: "get_state.jsp",
	data:'country_id='+val,
	success: function(data){
		$("#states").html(data);
	}
	});
}
</script>









</tr>



</table>


</form>
</body>











</html>