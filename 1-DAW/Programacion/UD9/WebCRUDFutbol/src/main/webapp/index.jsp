<%-- 
    Document   : index
    Created on : 15 may 2026, 18:57:50
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
        <title>CRUD - Futbol</title>
    </head>
    <body>
        <h1>CRUD - Futbol</h1>
        <div class="container">
            <a href="FutbolControlador?accion=listarEmpresa" class="btn">Listado equipo completo</a>
            <a href="FutbolControlador?accion=listarFutbolistas" class="btn">Listar futbolistas</a>
            <a href="FutbolControlador?accion=listarEquipos" class="btn">Listar equipos</a>
            
        </div>
    </body>
</html>
