<%-- 
    Document   : TwilightHeavy
    Created on : 06-10-2016, 0:47:45
    Author     : sahian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Twilight Heavy Set</title>
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
	</div>-->

	<div id="centralDes">

		<div id="imgCentralTwilight">
			
		</div>
	</div>

	<div id="latDerechoDes">
		<div id="desImg">
			<h3>Defense Type</h3>
			<p> <b>2 parts</b>	CON + +2, STR -1, HP + 487</p>
			<p>	<b>3 parts</b>	MP + 202, Resistance to shock + 7</p>
			<p> <b>4 parts</b>	M. Def. + 44</p>
			<p> <b>5 parts</b>	P. Def. + 87; Resistance to attributes + 10, P. Def. additional + 7%</p>

			<h3>Attack Type</h3>
			<p> <b>2 parts</b>	STR + 2, CON - 1</p>
			<p>	<b>3 parts</b>	Critical damage + 242, resistance to Hold + 7</p>
			<p> <b>4 parts</b>	MP - 4% with skill use</p>
			<p> <b>5 parts</b>	P. Atk. + 180; resistance to attributes + 10, P. Def. additional + 7%</p>
		</div>
             <div id="desImg">
            <h1>Precio 30.000</h1>
                 <form action="AddCookies" method="Post">
                 <input type='hidden' name='codigo' value='2'/> 
                  Cantidad <input type="number" name="cantidad" min="1" max="20" value="1">
                  <br>
                  <input type="submit" name="Agregar" value="Añadir al carro">
                 </form>
            </div>
	</div>
</body>
</html>