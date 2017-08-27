<%-- 
    Document   : admin
    Created on : 21-11-2016, 19:14:40
    Author     : Belén
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
    </head>
    <body>
        <div id="cabecera">
		<p id="cabTitulo">Lineage Data</p>
		<div id="logo"></div>
		
		
	</div>
        <ul class="nav">
		<li><a href="">Cliente</a>
                        <ul>
				<li><a href="#ingresaruser">Ingresar nuevo cliente</a></li>
				<li><a href="#modificaruser">Modificar cliente</a></li>
                                <li><a href="#eliminaruser">Eliminar cliente</a></li>
			</ul>
                </li>
		<li><a href="">Producto</a>
			<ul>
				<li><a href="#ingresaprod">Ingresar nuevo producto</a></li>
				<li><a href="#modificaprod">Modificar producto</a></li>
                                <li><a href="#eliminaprod">Eliminar producto</a></li>
			</ul>
		</li>
		<li><a href="">Administrador</a>
			<ul>
				<li><a href="#ingresaradmin">Ingresar nuevo administrador</a></li>
				<li><a href="#modificaradmin">Modificar administrador</a></li>
			</ul>
		</li>
                <li><a href="Logout">Cerrar sesión</a>
                    
				<!--<li><a href="">Contacto</a>
                                <ul>
						<li><a href="">Submenu1</a></li>
						<li><a href="">Submenu2</a></li>
						<li><a href="">Submenu3</a></li>
						<li><a href="">Submenu4</a>
							<ul>
								<li><a href="">Submenu1</a></li>
								<li><a href="">Submenu2</a></li>
								<li><a href="">Submenu3</a></li>
								<li><a href="">Submenu4</a></li>
							</ul>
						</li>
					</ul>
                                </li>-->
                                
	</ul>
        <div class="centro">
            <div class="centro2">
                <br><br><br>
                <br><br><br>
                
                <h1>Bienvenido administrador</h1>
                <br><br><br>
                Seleccione lo que desea hacer en el menú superior.
                <br><br><br><br><br><br><br><br><br>
                <br><br><br><br><br><br>
                <!--
                FORMULARIOS CLIENTE
                FORMULARIOS CLIENTE
                FORMULARIOS CLIENTE
                FORMULARIOS CLIENTE
                FORMULARIOS CLIENTE
                -->
                <form>
                    <a name="eliminaruser"></a>
                    <br><br><br>
                    <h2>Ingrese rut del cliente a eliminar</h2>
                    <br><br><br>
                    Rut: <input type="text" name="rut">
                    <br><br>
                    <input type="submit" name="EnviarRut" value="Eliminar cliente">
                </form>
                <br><br><br><br><br><br><br><br><br>
                <br><br><br><br><br><br>
                
                <form method="Post">
                     <a name="ingresaruser"></a>
                     <h2>Ingrese datos del cliente</h2>
                     Rut: <input type="text" name="rut" maxlength="15"><input type="submit" name="Buscar" value="Buscar" hidden>
                     <br><hr><br>
                     <center><table><tr>
                             <td>
                     Cuenta: <input type="text" name="cuenta" maxlength="50">
                     <br><br>
                     
                     PassWord: <input type="password" name="passwd" maxlength="45">
                     <br><br>
                     Reingrese PassWord: <input type="password" name="passwd2" maxlength="40">
                     <br><br>
                     
                     Nombre: <input type="text" name="nombre" maxlength="45">
                     <br><br></td><td>
                     Apellido Paterno: <input type="text" name="a_paterno" maxlength="45">
                     <br><br>
                     Apellido Materno: <input type="text" name="a_materno" maxlength="45">
                     <br><br>
                     Direccion: <input type="text" name="direccion" maxlength="100">
                     <br><br>
                     Telefono: <input type="text" name="fono" maxlength="12">
                     <br><br>
                     email: <input type="text" name="email" maxlength="100">
                             </td>
                     </tr>
                     </table></center>
                     <br><br>
                     <input type="submit" name="EnviarRegistro" value="Registar Cliente">
                 </form>
                
                
                <br><br><br><br><br><br><br><br><br>
                <br><br><br><br><br><br>
                <form method="Post">
                     <a name="modificaruser"></a>
                     <h2>Ingrese cuenta para modificar datos del cliente</h2>
                     Rut: <input type="text" name="rut" maxlength="15"><input type="submit" name="Buscar" value="Buscar" hidden>
                     <br><hr><br>
                     <center><table><tr>
                             <td>
                     Cuenta: <input type="text" name="cuenta" maxlength="50">
                     <br><br>
                     
                     PassWord: <input type="password" name="passwd" maxlength="45">
                     <br><br>
                     Reingrese PassWord: <input type="password" name="passwd2" maxlength="40">
                     <br><br>
                     
                     Nombre: <input type="text" name="nombre" maxlength="45">
                     <br><br></td><td>
                     Apellido Paterno: <input type="text" name="a_paterno" maxlength="45">
                     <br><br>
                     Apellido Materno: <input type="text" name="a_materno" maxlength="45">
                     <br><br>
                     Direccion: <input type="text" name="direccion" maxlength="100">
                     <br><br>
                     Telefono: <input type="text" name="fono" maxlength="12">
                     <br><br>
                     email: <input type="text" name="email" maxlength="100">
                             </td>
                     </tr>
                     </table></center>
                     <br><br>
                     <input type="submit" name="EnviarRegistro" value="Modificar Cliente">
                 </form>
                
                
                 
                <br><br><br><br><br><br><br><br><br>
                <br><br><br><br><br><br>
                <!--
                FORMULARIOS PRODUCTO
                FORMULARIOS PRODUCTO
                FORMULARIOS PRODUCTO
                FORMULARIOS PRODUCTO
                FORMULARIOS PRODUCTO
                -->
                
                <form>
                    <a name="eliminaprod"></a>
                    <br><br><br>
                    <h2>Ingrese id de producto a eliminar</h2>
                    <br><br><br>
                    Id producto: <input type="text" name="id">
                    <br><br>
                    <input type="submit" name="EnviarProducto" value="Eliminar producto">
                </form>
                 
                <br><br><br><br><br><br><br><br><br>
                <br><br><br><br><br><br>
                <form>
                    <a name="modificaprod"></a>
                    <br><br><br>
                    <h2>Ingrese id del producto a modificar</h2>
                    <br><br><br>
                    Id producto: <input type="text" name="id">
                    <br><br>
                    Nombre: <input type="text" name="nombre">
                    <br><br>
                    Precio: <input type="text" name="precio">
                    <br><br>
                    Stock: <input type="text" name="stock">
                    <br><br>
                    Categoría: <input type="text" name="categoria">
                    <br><br>
                    <input type="submit" name="EnviarProducto" value="Modificar producto">
                </form>
                 
                <br><br><br><br><br><br><br><br><br>
                <br><br><br><br><br><br>
                <form>
                    <a name="ingresaprod"></a>
                    <br><br><br>
                    <h2>Ingrese datos del producto a agregar</h2>
                    <br><br><br>
                    Id producto: <input type="text" name="id">
                    <br><br>
                    Nombre: <input type="text" name="nombre">
                    <br><br>
                    Precio: <input type="text" name="precio">
                    <br><br>
                    Stock: <input type="text" name="stock">
                    <br><br>
                    Categoría: <input type="text" name="categoria">
                    <br><br>
                    <input type="submit" name="EnviarProducto" value="Ingresar producto">
                </form>
                 
                <br><br><br><br><br><br><br><br><br>
                <br><br><br><br><br><br>
                
                <!--
                FORMULARIOS ADMIN
                FORMULARIOS ADMIN
                FORMULARIOS ADMIN
                FORMULARIOS ADMIN
                FORMULARIOS ADMIN
                -->
                
                <form method="Post">
                     <a name="modificaradmin"></a>
                     <h2>Ingrese cuenta para modificar datos del administrador</h2>
                     
                     Rut: <input type="text" name="rut" maxlength="15"><input type="submit" name="Buscar" value="Buscar" hidden>
                     <br><hr><br>
                     <center><table><tr>
                             <td>
                     Cuenta: <input type="text" name="cuenta" maxlength="50">
                     <br><br>
                     
                     PassWord: <input type="password" name="passwd" maxlength="45">
                     <br><br>
                     Reingrese PassWord: <input type="password" name="passwd2" maxlength="40">
                     <br><br>
                     
                     Nombre: <input type="text" name="nombre" maxlength="45">
                     <br><br></td><td>
                     Apellido Paterno: <input type="text" name="a_paterno" maxlength="45">
                     <br><br>
                     Apellido Materno: <input type="text" name="a_materno" maxlength="45">
                     <br><br>
                     Direccion: <input type="text" name="direccion" maxlength="100">
                     <br><br>
                     Telefono: <input type="text" name="fono" maxlength="12">
                     <br><br>
                     email: <input type="text" name="email" maxlength="100">
                             </td>
                     </tr>
                     </table></center>
                     <br><br>
                     <input type="submit" name="EnviarRegistro" value="Modificar Administrador">
                 </form>
                <br><br><br><br><br><br><br><br><br>
                <br><br><br><br><br><br>
                
                <form method="Post">
                     <a name="ingresaradmin"></a>
                     <h2>Ingrese datos del administrador</h2>
                     Rut: <input type="text" name="rut" maxlength="15"><input type="submit" name="Buscar" value="Buscar" hidden>
                     <br><hr><br>
                     <center><table><tr>
                             <td>
                     Cuenta: <input type="text" name="cuenta" maxlength="50">
                     <br><br>
                     
                     PassWord: <input type="password" name="passwd" maxlength="45">
                     <br><br>
                     Reingrese PassWord: <input type="password" name="passwd2" maxlength="40">
                     <br><br>
                     
                     Nombre: <input type="text" name="nombre" maxlength="45">
                     <br><br></td><td>
                     Apellido Paterno: <input type="text" name="a_paterno" maxlength="45">
                     <br><br>
                     Apellido Materno: <input type="text" name="a_materno" maxlength="45">
                     <br><br>
                     Direccion: <input type="text" name="direccion" maxlength="100">
                     <br><br>
                     Telefono: <input type="text" name="fono" maxlength="12">
                     <br><br>
                     email: <input type="text" name="email" maxlength="100">
                             </td>
                     </tr>
                     </table></center>
                     <br><br>
                     <input type="submit" name="EnviarRegistro" value="Registar Administrador">
                 </form>
                
                <br><br><br><br><br><br><br><br><br>
                <br><br><br><br><br><br>
            </div>
        </div>
    </body>
</html>
