<%-- 
    Document   : index
    Created on : 2 jun 2026, 12:20:08
    Author     : aidan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./css/style.css"/>
        <title>CRUD - Futbol</title>
    </head>
    <body>
        <h1>CRUD - Futbol</h1>
        <div class="container">
            <a href="FutbolControlador?accion=listar" class="btn">Listado futbolista-equipo</a>
            <a href="FutbolControlador?accion=listarf" class="btn">Listar futbolistas</a>
            <a href="FutbolControlador?accion=listare" class="btn">Listar equipos</a>
            
        </div>
    </body>
</html>
