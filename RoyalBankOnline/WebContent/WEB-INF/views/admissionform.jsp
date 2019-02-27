<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JNTUA college</title>
</head>
<body>
<form:errors path="student1.*"/>
<h1>${headermsg}</h1>
<form action="/ModelAttribute/register" method="post">
<table><tr><td>
Name: <input type="text" name="sname"><br></td></tr>
<tr><td>
MailId:<input type="text" name="mailid"><br></td></tr>
<tr><td>
<tr><td>
Hobbies:<input type="text" name="hobby"><br></td></tr>
<tr><td>
Mobno:<input type="text" name="mobno"></td></tr>
<tr><td>
Studnet DOB:<input type="text" name="sdob"></td></tr>
<tr><td>
Skills:</td><td> 
<select name="skillset" multiple="multiple">
<option value="CoreJava">Core Java</option>
<option value="J2ee">J2EE</option>
<option value="Spring">Spring</option>
<option value="Hibernite">Hibernate</option>
</select></td>
</tr>
<tr><td>
Student Address:
CountryName:<input type="text" name="saddress.countryName">
CityName:<input type="text" name="saddress.cityName">
PinCode:<input type="text" name="saddress.pincode"></td></tr>

<tr><td>
<input type="submit" value="register"></td></tr>

</table>
</form>
</body>
</html>