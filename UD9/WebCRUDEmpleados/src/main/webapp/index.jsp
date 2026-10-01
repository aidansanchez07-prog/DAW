<%-- 
    Document   : index
    Created on : 15 may 2026, 18:57:50
    Author     : jmigu
--%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--Estilos propios-->
        <link rel="stylesheet" href="./css/style.css"/>
        <title>CRUD - Empleados</title>
    </head>
    <body>
        <h1>CRUD - Empleados</h1>
        <div class="container">
            <a href="EmpleadoControlador?accion=listarEmpresa" class="btn">Listado empresa</a>
            <a href="EmpleadoControlador?accion=listar" class="btn">Listar empleados</a>
            <a href="EmpleadoControlador?accion=listarDeptos" class="btn">Listar departamentos</a>
            
        </div>
    </body>
</html>
