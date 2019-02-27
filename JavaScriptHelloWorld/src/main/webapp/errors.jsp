<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Execption</title>
<script type="text/javascript">

try{
	var x=prompt("ENter value:","500");
	var y=prompt("ENter value:","500");
	alert(parseInt(x)+parseInt(y));

}
catch (e) {
	alert("im in catch")
}
finally{
	
	alert("succes")
}

</script>

</head>
<body>

</body>
</html>