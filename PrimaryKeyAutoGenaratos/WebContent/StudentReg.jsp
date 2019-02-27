<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration form</title>
</head>
<body>
<form action="./StController" method="get">

Name:<input type="text" name="sname"/>
marks:<input type="text" name="marks"/>
email:<input type="text" name="email"/>
Address:<input type="text" name="address"/>
Grade:<input type="text" name="grade"/>
<input type="submit" value="register"/>


</form>
</body>
</html>