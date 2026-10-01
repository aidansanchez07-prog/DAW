<%-- 
    Document   : listare
    Created on : 2 jun 2026, 12:43:39
    Author     : aidan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./css/style.css"/>
        <title>Listado Futbolistas</title>
    </head>
    <body>
        <h1>Lista de equipos</h1>
        <div class="tabla">
            <h3>Gestion de equipos</h3>
            <hr>
            <a href="FutbolControlador?accion=nuevoe" class="btn-tabla">Nuevo</a>
            <table>
                <thead>
                    <tr>
                        <th>IDEquipo</th>
                        <th>Nombre</th>
                        <th>Descripcion</th>
                        <th>Acciones</th> 
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${equipo}" var="item">
                        <tr>
                            <td>${item.idequipo}</td>
                            <td>${item.nombre}</td>
                            <td>${item.descripcion}</td>
                            <td>
                                <a href="FutbolControlador?accion=editare&idequipo=${item.idequipo}" class="btn-tabla">Modificar</a>
                                <a href="FutbolControlador?accion=borrare&idequipo=${item.idequipo}" class="btn-tabla">Borrar</a>
                            </td> 
                        </tr>
                    </c:forEach>
                    
                    <c:if test="${empty equipo}">
                        <tr>
                            <td colspan="4">No hay registros de equipos.</td>
                        </tr>
                    </c:if>
                </tbody>
            </table>
        </div>
    </body>
</html>

