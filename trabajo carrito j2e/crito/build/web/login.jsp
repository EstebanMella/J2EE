<%-- 
    Document   : login
    Created on : 31-ago-2016, 14:17:43
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
                                <li><a href="registro.jsp">Registrarse</a></li>
				
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
         <div id="desImg">
            <title>Login</title>
             <h1>Ingrese sus datos</h1>
             <form action="Secion" method="Post">
                 <tr>
                     <td>Cuenta: </td><td><input type="text" name="cuenta"></td>
                 </tr>
                <br><br>
                <tr>
                <td>PassWord: </td><td><input type="password" name="passwd"></td>
                </tr>
                <br><br>
                 <input type="submit" name="login" value="Login">
             </form>
         </div>
      </div>
    </body>
</html>
