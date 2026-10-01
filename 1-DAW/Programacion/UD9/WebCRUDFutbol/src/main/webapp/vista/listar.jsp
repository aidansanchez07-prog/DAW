<%-- 
    Document   : listar
    Created on : 3 jun 2026, 21:02:43
    Author     : aidan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./css/style.css"/>
        <title>Listado Futbolistas-Equipos</title>
    </head>
    <body>
        <h1>Lista de Futbolistas con sus equipos</h1>
        <div class="tabla">
            <hr>
            <a href="index.jsp" class="btn-tabla">Volver al Inicio</a>
            <table>
                <thead>
                    <tr>
                        <th>IDFutbolista</th>
                        <th>Nombre</th>
                        <th>Goles</th>
                        <th>Sueldo</th>
                        <th>IDEquipo</th> 
                        <th>Nombre Equipo</th> 
                        <th>Descripcion Equipo</th> 
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${futbolista}" var="item">
                        <tr>
                            <th>${item.idfutbolista}</th>
                            <th>${item.nombre}</th>
                            <th>${item.goles}</th>
                            <th>${item.sueldo}</th>
                            <th>${item.equipo.idequipo}</th>
                            <th>${item.equipo.nombre}</th>
                            <th>${item.equipo.descripcion}</th>
                        </tr>
                    </c:forEach>
                    <c:if test="${futbolista.size() == 0}">
                        <tr>
                            <td colspan="5">No hay registros de futbolistas asignados a un club.</td>
                        </tr>
                    </c:if>
                </tbody>
            </table>
        </div>
    </body>
</html>