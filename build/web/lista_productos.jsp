<%-- 
    Document   : lista_productos
    Created on : Jan 24, 2015, 8:54:30 AM
    Author     : andres
--%>

<%@page import="java.util.List"%>
<%@page import="mx.com.develop.store.model.Producto"%>
<%@page isELIgnored="false" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>
        <title>Develop Store: Listado de Productos</title>
        <style type='text/css'>
            #table { 
                border-collapse: collapse; 
            }
        </style>
    </head>
    <body>
        <table border='0' cellpadding='5' cellspacing='0' width='800'> 
            <tr bgcolor='#3882C7' align='center' valign='center' height='20'> 
                <td>
                    <h3><font color='white'>Develop Store: Listado de Productos</h3>
                </td> 
            </tr> 
            <tr align='right'> 
                <td>
                    <table>
                        <tr>

                            <td>Usuario: </td>
                            <!--<td><%= request.getAttribute("user") %></td>-->
                            <td>${ user }</td>
                        </tr>
                    </table>
                </td> 
            </tr> 
        </table>
        <b>Usted está aquí:</b> <a href="index.html">Inicio</a>/Listado de Productos        
        <h2>Lista de Productos:</h2>
        <table border='1' width='800' id='table'>
            <thead>
                <tr bgcolor='#3882C7'>
                    <th>No.</th>
                    <th>Descripción</th>
                    <th>Tipo</th>
                    <th>Color</th>
                    <th>Talla</th>
                    <th>Precio</th>
                    <th>Disponibles</th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <%
                    List<Producto> productos = ( List<Producto> )request.getAttribute("productos");
                    
                    for( Producto producto: productos)
                    {
                %>
                <tr>
                    <td><%= producto.getId( )%></td>
                    <!--<td>$\{productos.\}</td>-->
                    <td><%=producto.getDescripcion( )%></td>
                    <td><%=producto.getTipo( )%></td>
                    <td><%=producto.getColor( )%></td>
                    <td><%=producto.getTalla( )%></td>
                    <td><%=producto.getPrecio( )%></td>
                    <td></td>
                    <td><img src="imagenes/carrito.png" width="40" height="40" alt="carrito"/>
                    </td>
                </tr>
                <%
                    }
                %>
                
            </tbody>
        </table>
    </body>
</html>