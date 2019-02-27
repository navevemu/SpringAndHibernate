<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<button onmousemove="show()" onclick="bclick()" onmouseout="mout()" onblur="blur()"> Mouse over</button>

<p id ="res"></p>
<script type="text/javascript">
function show()
{
	document.getElementById("res").innerHTML="mouse is on button";
	}

function bclick()
{	document.getElementById("res").innerHTML="button is clicked";
	}
function mout()
{	document.getElementById("res").innerHTML="mouse out";
	}
function blur()
{	document.getElementById("res").innerHTML="button is blur";
	}

</script>
</body>
</html>