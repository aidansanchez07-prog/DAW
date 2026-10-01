<%-- 
    Document   : listarEmpresa
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
        <title>Listado Equipo Completo</title>
    </head>
    <body>
        <h1>Listado equipo completo</h1>
        <div class="tabla">
            <h3>Futbolistas con su equipo</h3>
            <hr>
            <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nombre Futbolista</th>
                        <th>Goles</th>
                        <th>Sueldo</th>
                        <th>Equipo</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${futbolistas}" var="item">
                        <tr>
                            <th>${item.idfutbolista}</th>
                            <th>${item.nombre}</th>
                            <th>${item.goles}</th>
                            <th>${item.sueldo}</th>
                            <th>${item.nombreEquipo}</th>
                        </tr>
                    </c:forEach>
                    <c:if test="${futbolistas.size() == 0}">
                        <tr>
                            <td colspan="5">No hay registros.</td>
                        </tr>
                    </c:if>
                </tbody>

            </table>
        </div>
    </body>
</html>
