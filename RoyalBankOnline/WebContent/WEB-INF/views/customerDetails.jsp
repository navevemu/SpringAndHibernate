<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account Creation Details</title>
</head>
<body bgcolor="orange">
<div align="center" style="background: lime;"><h1 style="size: 100px;">Royal Bank</h1></div>
<div align="center">
<h1>Congratulations your account is succesfully created</h1>
<h2>Please enter below details for verfication</h2>
<form action="/RoyalOnlineBank/customerDetails" method="post">
<table>
<tr><td>
Account Number: </td><td> <input type="text" name="accountNo" value="${accountNo}">
</td></tr>
<tr><td>
Bank Ifsc: </td><td> <input type="text" name="bankIfsc" value="RB100000" required>
</td></tr>
<tr><td>
Adhar number: </td><td> <input type="text" name="adharNo">
</td></tr>
<tr><td>
PAN number: </td><td> <input type="text" name="panNo" required>
</td></tr>
<tr><td>
Savings Amount: </td><td> <input type="text" name="savingsAmount" value=0.0>
</td></tr>
<tr><td>
Fixed Deposit Amount: </td><td> <input type="text" name="depositAmount" value=0.0>
</td></tr>
</table>
</br>
<input type="submit" value="Update Account Details ">&nbsp &nbsp<input type="reset" Value="Clear Form">
</form>
</div>





</table>
</form>

</body>
</html>