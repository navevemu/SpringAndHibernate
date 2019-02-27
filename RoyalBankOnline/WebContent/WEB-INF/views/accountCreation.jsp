<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account Creation</title>
</head>
<body bgcolor="orange">
<div align="center" style="background: lime;"><h1 style="size: 100px;">Royal Bank</h1></div>
<div align="center">
<form action="/RoyalOnlineBank/accountCreation" method="post">
<h6 style="color: navy;">Please Enter the Following details</h6>
<table>
<tr><td>
First Name: </td><td> <input type="text" name="firstName" required>
</td></tr>
<tr><td>
Last Name: </td><td>  <input type="text" name="lastName" required>
</td></tr>
<tr><td>
Father'Names:</td><td><input type="text" name="fatherName" required>
</td></tr>
<tr><td>
<tr><td>
Gender:</td><td><input type="radio" name="gender"  value="Male" required>Male
		<input type="radio" name="gender"  value="Female" required>Female
		<input type="radio" name="gender" value="other"> Other  
		

</td></tr>
<tr><td>
Date of Birth:</td><td><input type="date" name="dob" required>
</td></tr>
<tr><td>
Mobile Number:</td><td><input type="text" name="mobNo" required>
</td></tr>
<tr><td>
Email ID:</td><td><input type="text" name="emailId" required>
</td></tr>
<tr><td>
Occupation:</td><td><input type="text" name="occupation" required>
</td></tr>
<tr><td>
PassWord:</td><td><input type="text" name="password" required>
</td></tr><tr><td>
ConfrimPassword:</td><td><input type="text" name="cPassword" required>
</td></tr>
<tr><td>
Address
</td></tr>
<tr><td>
Doorno/Street Name:</td><td><input type="text" name="address.streetName" required>
CityName:<input type="text" name="address.cityName">
CountryName:<input type="text" name="address.countryName">
PinCode:<input type="text" name="address.pincode" required></td></tr>
</table>
</br>
<input type="submit" value="Create Account">&nbsp &nbsp<input type="reset" Value="Clear Form">




</form>
</div>



</body>
</html>