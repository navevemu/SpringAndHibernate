<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function showFruits(){
	
var fruits=["apple","mango","banana","grapes","guava"];
document.getElementById("fr").innerHTML=fruits;

var veg=new Array();
veg[0]="tomato";
veg[1]="chille";
veg[2]="drumsticks";


document.getElementById("veg").innerHTML=veg;
var tiffins=new Array("dosa","idle","puri","chapathi");

document.getElementById("ti").innerHTML=tiffins;
}
</script>
</head>
<body>
	<p id="fr"></p>
	<p id="veg"></p>
	<p id="ti"></p>
	<button onclick="showFruits()">Show Fruits</button>
</body>
</html>