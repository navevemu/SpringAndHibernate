<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Map" %>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@page import="Dao.StatesDao"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>


<script type="text/javascript">
$(document).ready(function(){
	
	$('#submit').click(function(e){
		e.preventDefault();
		var cName=$('#countries').val();
		alert('${pageContext.request.contextPath }');
		$.ajax({
			type:'GET',
			url:'${pageContext.request.contextPath }/pages/display1.html',
			data:'cName='+$('#countries').val(),
			success: function(response){
				  var i = 0;
                  var table = '<table class="mainTable" border="collapse"><tr><th>SNO</th><th>CountryName</th><th>StateName</th></tr>';
                  data = $.parseJSON(response)
                        $.each(data, function (idx, obj) {                                   
                             table += ('<tr>');
                             table += ('<td>' + obj.sno + '</td>');
                             table += ('<td>' + obj.countryName + '</td>');
                             table += ('<td>' + obj.stateName + '</td>');
                             table += ('</tr>');
                       });
                  table += '</table>';
                 $("#result").html(table);

// 				$('#result').html(response);
				
			}	
			
		})
	});
	
});


</script>
</head>
<body>

<%
StatesDao s=new StatesDao();
List<String> s1=new ArrayList<String>();
s1=s.getCountries();
%>
<form action="./data" method="post" id="f">
<table>

<tr>
<td>

<select id="countries" name="countries" onchange="filterList(value)">
<option value="">Select country </option>
<%for(int i=0;i<s1.size();i++){%>
<option value="<%=s1.get(i) %>"><%=s1.get(i) %></option>
<%} %>

</select>
<input type="button" value="submit" id="submit">
</td>
</tr>
</table>
</form>


 <div id="result"></div>

 
</body>
</html>
