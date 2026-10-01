<%-- 
    Document   : nuevoFutbolista.jsp
    Created on : 22 may 2026, 17:14:49
    Author     : aidan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo futbolista</title>
    </head>
    <body>
        <div class="container">
            <h3>${futbolista.idfutbolista==0 ?"Nuevo":"Editar"} futbolista</h3><!-- comment -->
            <hr><!-- comment -->
            <div>
                <form action="../FutbolControlador" method="post">
                    <div style="margin-bottom: 10px">
                        <label>Nombre:</label><!-- comment -->
                        <input value="${futbolista.nombre}" name="nombre" type="text" maxlength="45" class="form.control" required="true">
                    </div>
                    <div style="margin-bottom: 10px">
                        <label>Goles:</label><!-- comment -->
                        <input value="${futbolista.goles}" name="goles" type="number" class="form.control" required="true">
                    </div>
                    <div style="margin-bottom: 10px">
                        <label>Sueldo:</label><!-- comment -->
                        <input value="${futbolista.sueldo}" name="sueldo" type="number" class="form.control" required="true">
                    </div>
                    <div style="margin-bottom: 10px">
                        <label>Nombre equipo:</label><!-- comment -->
                        <input value="${futbolista.nombreEquipo}" name="nombreEquipo" type="text" maxlength="45" class="form.control" required="">
                    </div>
                    <div><!-- comment -->
                        <%--
                            Accion de tipo oculta donde vamos a cargar el valor del id --> y así este id lo recupero al guardar.
                        --%>
                        <input type="hidden" name="idfutbolista" value="${futbolista.idfutbolista}">
                        <input  type="hidden" name="accion" value="guardarFutbolista">
                        <button class="btn">Guardar</button>
                        <a href="FutbolControlador?accion=listarFutbolistas" class="btn">Volver atrás</a>
                    </div>
                </form>
                      
            </div>
        </div>
    </body>
</html>
