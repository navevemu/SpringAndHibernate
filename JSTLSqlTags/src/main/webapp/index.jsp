
<%@ page import="java.io.*,java.util.*,java.sql.*"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
<%@page isELIgnored="false" %>
<html>
<body>

<sql:setDataSource var="db" driver="oracle.jdbc.OracleDriver" 
url="jdbc:oracle:thin:192.168.0.103:1521:orcl"
user="naveen"
password="naveen"
/>
<sql:query var="rs" dataSource="${db}" >

SELECT * from studentreg </sql:query>

<table border="2" width="100%">
<tr>
<th>si</th>
<th>sname</th>
<th>mobileNumber</th>
<th>Intrested course</th>
</tr>

<c:forEach var="table" items="${rs.rows}">
<tr>
<td><c:out value="${table.sid }"></c:out></td>
<td><c:out value="${table.sname }"></c:out></td>
<td><c:out value="${table.mobileno }"></c:out></td>
<td><c:out value="${table.intrestedcourse}"></c:out></td>
</tr>
</c:forEach>


</table>
</body>
</html>
