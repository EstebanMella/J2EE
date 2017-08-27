<%-- 
    Document   : EternalHeavy
    Created on : 10-10-2016, 22:46:53
    Author     : sahian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Eternal Heavy Set</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body link="#ffffcc" vlink="#ffffcc" alink="#ffffcc">
	<div id="cabecera">
		<div id="logo"></div>

		<div id="menu">
			<ul>
			<ul class="claseLista">
				<li><a href="login.jsp">Login</a></li>
                                <li><a href="registro.jsp">Registrarse</a></li>
				<li><a href="index.jsp">Home</a></li>
			</ul>
		</div>

	</div>

<!--
	<div id="latiz">
		<ul class="listaIz">
			<li>Item I</li>
			<li>Item II</li>
			<li>Item III</li>
			<li>Item IV</li>
		</ul>
	</div>
-->
	<div id="centralDes">

		<div id="imgCentralEternal">
			
		</div>
	</div>

	<div id="latDerechoDes">
		<div id="desImg">
			<h3>Defense Type</h3>
			<p> <b>2 parts</b>	CON +3, STR -1; HP + 521</p>
			<p>	<b>3 parts</b>	Critical received - 3.3%; Resistance to shock + 10</p>
			<p> <b>4 parts</b>	Received heal amount + 108, M. Def. + 54</p>
			<p> <b>5 parts</b>	P. Def. + 103; Resistance to attributes + 15, P. Def. additional + 7%</p>

			<h3>Attack Type</h3>
			<p> <b>2 parts</b>	STR +3, CON -1</p>
			<p>	<b>3 parts</b>	Critical Damage + 298; Resistance to Hold + 10</p>
			<p> <b>4 parts</b>	HP + 521; Chance of absorbing 2% of damage</p>
			<p> <b>5 parts</b>	P. Atk. + 246, Resistance to attributes + 15, P. Def. additional + 7%</p>
		</div>
	
    
        <div id="desImg">
            <h1>Precio 50.000</h1>
                 <form action="AddCookies" method="Post">
                 <input type='hidden' name='codigo' value='4'/> 
                  Cantidad <input type="number" name="cantidad" min="1" max="20" value="1">
                  <br>
                  <input type="submit" name="Agregar" value="Añadir al carro">
                 </form>
            </div>
	</div>
</body>
</html>