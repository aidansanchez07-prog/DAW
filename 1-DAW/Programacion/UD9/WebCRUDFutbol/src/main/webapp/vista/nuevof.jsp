<%-- 
    Document   : nuevof
    Created on : 2 jun 2026, 17:29:38
    Author     : aidan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./css/style.css"/>
        <title>Nuevo Futbolista</title>
    </head>
    <body>
        <div class="container">
            <h3>${futbolista.idfutbolista == 0 ? "Nuevo" : "Editar"} futbolista</h3>
            <hr>
            <div>
                <form action="FutbolControlador" method="post">
                    
                    <div style="margin-bottom: 10px">
                        <label>Nombre:</label>
                        <input value="${futbolista.nombre}" name="nombre" type="text" maxlength="45" class="form-control" required="true">
                    </div>
                    
                    <div style="margin-bottom: 10px">
                        <label>Goles:</label>
                        <input value="${futbolista.goles}" name="goles" type="number" class="form-control" required="true">
                    </div>
                    
                    <div style="margin-bottom: 10px">
                        <label>Sueldo:</label>
                        <input value="${futbolista.sueldo}" name="sueldo" type="number" class="form-control" required="true">
                    </div>
                    
                    <div style="margin-bottom: 10px">
                        <label>Nombre equipo:</label>
                        <input value="${futbolista.equipo.nombre}" name="nombreEquipo" type="text" maxlength="45" class="form-control" required="true">
                    </div>
                    
                    <%-- Accion de tipo oculta donde vamos a cargar el valor del id --%>
                    <input type="hidden" name="idfutbolista" value="${futbolista.idfutbolista}">
                    <input type="hidden" name="accion" value="guardarf">
                    
                    <div style="margin-top: 15px">
                        <button class="btn">Guardar</button>
                        <a href="FutbolControlador?accion=listarf" class="btn">Volver atrás</a>
                    </div>
                    
                </form>
            </div>
        </div>
    </body>
</html>
