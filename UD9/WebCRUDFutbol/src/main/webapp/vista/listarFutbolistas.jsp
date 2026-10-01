<%-- 
    Document   : listarFutbolistas
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
        <title>Listado Futbolistas</title>
    </head>
    <body>
        <h1>Lista de futbolistas</h1>
        <div class="tabla">
            <h3>Gestion de futbolistas</h3>
            <hr>
            <a href="FutbolControlador?accion=nuevoFutbolista" class="btn-tabla">Nuevo</a>
            <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Goles</th>
                        <th>Sueldo</th>
                        <th>Acciones</th> 
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${futbolistas}" var="item">
                        <tr>
                            <th>${item.idfutbolista}</th>
                            <th>${item.nombre}</th>
                            <th>${item.goles}</th>
                            <th>${item.sueldo}</th>
                            <td><a href="FutbolControlador?accion=editarFutbolista&idfutbolista=${item.idfutbolista}" class="btn-tabla">Modificar</a>
                                <a href="FutbolControlador?accion=borrarFutbolista&idfutbolista=${item.idfutbolista}" class="btn-tabla">Borrar</a>
                            </td> 
                        </tr>
                    </c:forEach>
                    <c:if test="${futbolistas.size() == 0}">
                        <tr>
                            <td colspan="5">No hay registros de futbolistas.</td>
                        </tr>
                    </c:if>
                </tbody>

            </table>
        </div>
    </body>
</html>
