<html>
<head>
<script type="text/javascript">
function product(x,y){
	
	document.getElementById("res").innerHTML=x*y;
}

</script>
</head>
<body>
<form>
<pre>
P1:<input type="text" name="p1" id="p1">
P2:<input type="text" name="p2" id="p2">
<!-- <button value="multiply" onclick="multiply()" name="product"></button> -->

</pre>

</form>
<button value="multiply" onclick="product(3,5)" name="product"></button>
<p id="res"></p>
<script type="text/javascript" >

function multiply(){
	
	var x=document.getElementById("p1").value;
	var y=document.getElementById("p2").value;
	var res=product(x,y);
	document.getElementById("res").innerHTML=res;
}

</script>

</body>
</html>
