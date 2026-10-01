<%-- 
    Document   : listar
    Created on : 21 may 2026, 19:23:39
    Author     : aidan
--%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--Estilos propios-->
        <link rel="stylesheet" href="./css/style.css"/>
        <title>Listado Empleados</title>
    </head>
    <body>
        <h1>Lista de empleados</h1>
        <div class="tabla">
            <h3>Gestion de empleados</h3>
            <hr>
            <a href="EmpleadoControlador?accion=nuevo" class="btn-tabla">Nuevo</a>
            <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Apellidos</th>
                        <th>Fecha Ingreso</th>
                        <th>Sueldo</th>
                        <th>Acciones</th> 
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${empleados}" var="item">
                        <tr>
                            <th>${item.id}</th>
                            <th>${item.nombre}</th>
                            <th>${item.apellidos}</th>
                            <th>${item.fechaIngreso}</th>
                            <th>${item.sueldo}</th>
                            <td><a href="EmpleadoControlador?accion=editar&id=${item.id}" class="btn-tabla">Modificar</a>
                                <a href="EmpleadoControlador?accion=borrar&id=${item.id}" class="btn-tabla">Borrar</a>
                            </td> 
                        </tr>
                    </c:forEach>
                    <c:if test="${empleados.size() == 0}">
                        <tr>
                            <td colspan="5">No hay registros de empleados.</td>
                        </tr>
                    </c:if>
                </tbody>

            </table>
        </div>
    </body>
</html>
