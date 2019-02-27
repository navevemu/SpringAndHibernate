<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration success</title>
</head>
<body>
<h1>${headermsg}</h1>
<h1>${msg}</h1>
<table>
<tr><td>Student Name</td>
<td>${student1.sname}</td>
</tr>
<tr><td>Student Hobby</td>
<td>${student1.hobby}</td>
</tr>
<tr><td>Studnet mail id</td>
<td>${student1.mailid}</td></tr>
<tr><td>Studnet mobile number</td>
<td>${student1.mobno}</td></tr>
<tr><td>Studnet DOB</td>
<td>${student1.sdob}</td></tr>
<tr><td>Studnet Skills</td>
<td>${student1.skillset}</td></tr>
<tr><td>Studnet Address</td>
<td>${student1.saddress.countryName}</td>
<td>${student1.saddress.cityName}</td>
<td>${student1.saddress.pincode}</td>

</table>
</body>
</html>