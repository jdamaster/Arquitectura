<%-- 
    Document   : NuevoEmpleadoComision
    Created on : 8/01/2015, 06:33:27 PM
    Author     : LuisD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="SubirServlet" enctype="multipart/form-data">
            <h1>Agregar empleado por comisión</h1>
            <p>Nombre:</p><input type="text" name="nombre" size="45">
            <p>Apellido:</p><input type="text" name="apellido" size="45">
            <p>Número del seguro social:</p><input type="text" name="nroSeguro" size="45">
            <p>Ventas brutas:</p><input type="text" name="ventaBruta" size="45">
            <p>Porcentaje de comisión:</p><input type="text" name="porcentajeComision" size="45">
            <input type="hidden" name="type" value="ec">
            <input type="submit" value="guardar" name="submit" />
        </form>
    </body>
</html>
