<%-- 
    Document   : index
    Created on : 24-ago-2016, 14:03:47
    Author     : SantoTomas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>Lineage Data</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body link="#ffffcc" vlink="#ffffcc" alink="#ffffcc">
	<div id="cabecera">
		<p id="cabTitulo">Lineage Data</p>
		<div id="logo"></div>
		
		<div id="menu">
			<ul>
			<ul class="claseLista">
				<li><a href="login.jsp">Login</a></li>
                                <li><a href="registro.jsp">Registrarse</a></li>
				<li><a href="index.jsp">Home</a></li>
				
				
			</ul>
                            <form action="VerCookies" method="Get"><input type="submit" name="VerCarrito" value="Ver Carrito"  class="boton"></form>
		</div>
	</div>
<!--
	<div id="latiz">
		<ul class="listaIz">
                   
			<li>Item II</li>
			<li>Item III</li>
			<li>Item IV</li>
		</ul>
	</div>-->
	<div id="central">
		<table id="tablaCen">
		<tr > 
			<td id="imgTabla11"></td> <td id="imgTabla12"></td> <td id="imgTabla13"></td> <td id="imgTabla14"></td>
		</tr>
		<tr> 
			<td id="texTabla"><li><a href="ImmortalHeavy.jsp">Set Immortal Heavy</a></li></td> <td id="texTabla"><li><a href="TwilightHeavy.jsp">Set Twilight Heavy</a></li></td> <td id="texTabla"><li><a href="SeraphHeavy.jsp">Set Seraph Heavy</a></li> </td > <td id="texTabla"><li><a href="EternalHeavy.jsp">Set Eternal Heavy</a></li></td>
		</tr>
			
		</table>
	</div>
	<div id="latde"></div>
	<div id="pie">
		<div>
			<ul id="piePag">
			<p>Foro</p>
			<p>Web Master</p>

			</ul>
		</div>
	</div>
</body>
</html>