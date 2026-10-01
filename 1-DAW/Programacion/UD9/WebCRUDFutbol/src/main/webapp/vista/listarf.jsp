<%-- 
    Document   : listarf
    Created on : 2 jun 2026, 12:22:27
    Author     : aidan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="jakarta.tags.core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./css/style.css"/>
        <title>Listado Futbolistas</title>
    </head>
    <body>
        <h1>Lista de futbolistas</h1>
        <div class="tabla">
            <h3>Gestion de futbolistas</h3>
            <hr>
            <a href="FutbolControlador?accion=nuevof" class="btn-tabla">Nuevo</a>
            <table>
                <thead>
                    <tr>
                        <th>IDFutbolista</th>
                        <th>Nombre</th>
                        <th>Goles</th>
                        <th>Sueldo</th>
                        <th>Acciones</th> 
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${futbolista}" var="item">
                        <tr>
                            <th>${item.idfutbolista}</th>
                            <th>${item.nombre}</th>
                            <th>${item.goles}</th>
                            <th>${item.sueldo}</th>
                            <td>
                                <a href="FutbolControlador?accion=editarf&idfutbolista=${item.idfutbolista}" class="btn-tabla">Modificar</a>
                                <a href="FutbolControlador?accion=borrarf&idfutbolista=${item.idfutbolista}" class="btn-tabla">Borrar</a>
                            </td>
                        </tr>
                    </c:forEach>
                    <c:if test="${futbolista.size() == 0}">
                        <tr>
                            <td colspan="5">No hay registros de futbolistas.</td>
                        </tr>
                    </c:if>
                </tbody>

            </table>
        </div>
    </body>
</html>
