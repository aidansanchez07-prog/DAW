<%-- 
    Document   : listarEquipos
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
        <link rel="stylesheet" href="../css/style.css"/>
        <title>Listado Equipos</title>
    </head>
    <body>
        <h1>Lista de equipos</h1>
        <div class="tabla">
            <h3>Gestion de equipos</h3>
            <hr>
            <a href="FutbolControlador?accion=nuevoEquipo" class="btn-tabla">Nuevo</a>
            <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Descripcion</th>
                        <th>Acciones</th> 
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${equipos}" var="item">
                        <tr>
                            <th>${item.idequipo}</th>
                            <th>${item.nombre}</th>
                            <th>${item.descripcion}</th>
                            <td><a href="FutbolControlador?accion=editarEquipo&idequipo=${item.idequipo}" class="btn-tabla">Modificar</a>
                                <a href="FutbolControlador?accion=borrarEquipo&idequipo=${item.idequipo}" class="btn-tabla">Borrar</a>
                            </td> 
                        </tr>
                    </c:forEach>
                    <c:if test="${equipos.size() == 0}">
                        <tr>
                            <td colspan="4">No hay registros de equipos.</td>
                        </tr>
                    </c:if>
                </tbody>

            </table>
        </div>
    </body>
</html>
