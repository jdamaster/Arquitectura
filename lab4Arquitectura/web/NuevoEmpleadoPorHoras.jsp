<%-- 
    Document   : NuevoEmpleadoPorHoras
    Created on : 8/01/2015, 06:35:01 PM
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
            <h1>Agregar empleado por horas</h1>
            <p>Nombre:</p><input type="text" name="nombre" size="45">
            <p>Apellido:</p><input type="text" name="apellido" size="45">
            <p>Número del seguro social:</p><input type="text" name="nroSeguro" size="45">
            <p>Horas trabajadas:</p><input type="text" name="horas" size="45">
            <p>Salario por hora:</p><input type="text" name="salarioHora" size="45">
            <input type="hidden" name="type" value="eh">
        </form>
    </body>
</html>
