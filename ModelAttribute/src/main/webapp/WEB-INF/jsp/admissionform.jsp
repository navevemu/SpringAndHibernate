<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
  <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JNTUA college</title>
</head>
<body>
<a href="/ModelAttribute/admission?siteLanguage=en">English</a>
<a href="/ModelAttribute/admission?siteLanguage=fr">French</a>
<form:errors path="student1.*"/>
<h1>${headermsg}</h1>
<form action="/ModelAttribute/register" method="post">
<table><tr><td>
<spring:message code="label.sname"/><input type="text" name="sname"><br></td></tr>
<tr><td>
<spring:message code="label.email"/><input type="text" name="mailid"><br></td></tr>
<tr><td>
<tr><td>
<spring:message code="label.hobbie"/><input type="text" name="hobby"><br></td></tr>
<tr><td>
<spring:message code="label.mobileNumber"/><input type="text" name="mobno"></td></tr>
<tr><td>
<spring:message code="label.sdob"/><input type="text" name="sdob"></td></tr>
<tr><td>
<spring:message code="label.skills"/></td><td> 
<select name="skillset" multiple="multiple">
<option value="CoreJava">Core Java</option>
<option value="J2ee">J2EE</option>
<option value="Spring">Spring</option>
<option value="Hibernite">Hibernate</option>
</select></td>
</tr>
<tr><td>
<spring:message code="label.address"/>
<spring:message code="label.country"/><input type="text" name="saddress.countryName">
<spring:message code="label.city"/><input type="text" name="saddress.cityName">
<spring:message code="label.pincode"/><input type="text" name="saddress.pincode"></td></tr>

<tr><td>
<input type="submit" value="register"></td></tr>

</table>
</form>
</body>
</html>