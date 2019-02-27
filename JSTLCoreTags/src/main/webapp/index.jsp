
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<body>
<%-- <c:import var="data" url="https://www.javatpoint.com/jstl-core-import-tag"/> --%>
<%-- <c:set var="data" scope="session" value="Naveen"></c:set> --%>

<c:catch var="error" >

<c:set var="error" value="2/0"></c:set>
<%int c= 2/0; %>


</c:catch>
<c:out value="${error}"></c:out>	
<c:remove var="data"/>
<c:out value="${data}"></c:out>
 <c:redirect url="http://javatpoint.com"/> 
</body>
</html>
