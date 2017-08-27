<%-- 
    Document   : registro
    Created on : 31-ago-2016, 14:18:09
    Author     : SantoTomas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Lineage Data</title>
	<link rel="stylesheet" type="text/css" href="css/style.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
  <body link="#ffffcc" vlink="#ffffcc" alink="#ffffcc">
	<div id="cabecera">
		<p id="cabTitulo">Lineage Data</p>
		<div id="logo"></div>
		
		<div id="menu">
			<ul>
			<ul class="claseLista">
				<li><a href="index.jsp">Home</a></li>
                                <li><a href="login.jsp">Login</a></li>
				
				
			</ul>
                            <form action="VerCookies" method="Get"><input type="submit" name="VerCarrito" value="Ver Carrito"></form>
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
            <div id="central">
                 <h1>Ingrese sus datos</h1>
                 <form action="NewServlet" method="Post">
                     Cuenta: <input type="text" name="cuenta" maxlength="50">
                     <br><br>
                     PassWord: <input type="password" name="passwd" maxlength="45">
                     <br><br>
                     Reingrese PassWord: <input type="password" name="passwd2" maxlength="40">
                     <br><br>
                     Rut: <input type="text" name="rut" maxlength="15">
                     <br><br>
                     Nombre: <input type="text" name="nombre" maxlength="45">
                     <br><br>
                     Apellido Paterno: <input type="text" name="a_paterno" maxlength="45">
                     <br><br>
                     Apellido Materno: <input type="text" name="a_materno" maxlength="45">
                     <br><br>
                     Direccion: <input type="text" name="direccion" maxlength="100">
                     <br><br>
                     Telefono: <input type="text" name="fono" maxlength="12">
                     <br><br>
                     email: <input type="text" name="email" maxlength="100">
                     <br><br>
                     <input type="submit" name="EnviarRegistro" value="Registar Cliente">
                 </form>
            </div>
      </div>
    </body>
</html>
