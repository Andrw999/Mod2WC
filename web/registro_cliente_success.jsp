<%-- 
    Document   : registro_cliente_success
    Created on : Jan 24, 2015, 1:09:59 PM
    Author     : andres
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Develop Store: Registro Satisfecho</title>
    </head>
    <body>
        <table border='0' cellpadding='5' cellspacing='0' width='800'> 
            <tr bgcolor='#3882C7' align='center' valign='center' height='20'> 
                <td>
                    <h3><font color="white">Develop Store: Registro Satisfactorio.</h3>
                </td> 
            </tr> 
            <tr align='right'> 
                <td>
                    <b>Usted está aquí:</b> <a href="index.html">Inicio</a>/Registro 
                </td> 
            </tr> 
        </table>
        <p>
            You have successfully registered your information.
        </p>
        <p><strong>Nombre:</strong> ${cliente.nombre}</p>
        <p><strong>Edad:</strong> ${cliente.edad}</p>
        <p><strong>Dirección:</strong> ${cliente.direccion}</p>
        <p><strong>Télefono:</strong> ${cliente.telefono}</p>
        <p><strong>Usuario:</strong> ${cliente.usuario}</p>
        <p><strong>Contrasena:</strong> ${cliente.contrasena}</p>
        
    </body>
</html>
