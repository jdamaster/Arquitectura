<%-- 
    Document   : listaEmpleados
    Created on : 9/01/2015, 01:32:09 PM
    Author     : Usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de empleados</title>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>No seguro social</th>
                    <th>Salario neto</th>
                </tr>
            </thead>
            <tbody>
                <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
                 <c:forEach items="${listaEmpleados}" var="empl">
                    <tr>
                        <td>${empl.getNombre()}</td>
                        <td>${empl.getApellido()}</td>
                        <td>${empl.getNoSeguroSocial()}</td>
                        <td>${empl.salario()}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

                    <a href="NuevoEmpleadoAsalariado.jsp">Menu principal</a>
    </body>
</html>
