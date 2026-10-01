<%-- 
    Document   : nuevoe
    Created on : 2 jun 2026, 12:54:19
    Author     : aidan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="./css/style.css"/>
        <title>Nuevo Equipo</title>
    </head>
    <body>
        <div class="container">
            <h3>${equipo.idequipo==0 ?"Nuevo":"Editar"} equipo</h3><!-- comment -->
            <hr><!-- comment -->
            <div>
                <form action="FutbolControlador" method="post">
                    <div style="margin-bottom: 10px">
                        <label>Nombre:</label><!-- comment -->
                        <input value="${equipo.nombre}" name="nombre" type="text" maxlength="45" class="form.control" required="true">
                    </div>
                    <div style="margin-bottom: 10px">
                        <label>Descripcion:</label><!-- comment -->
                        <input value="${equipo.descripcion}" name="descripcion" type="text" maxlength="100" class="form.control" required="true">
                    </div>
                
                        <%--
                            Accion de tipo oculta donde vamos a cargar el valor del id -- > y así este id lo recupero al guardar.
                        --%>
                        <input type="hidden" name="idequipo" value="${equipo.idequipo}">
                        <input  type="hidden" name="accion" value="guardare">
                        <button class="btn">Guardar</button>
                        <a href="FutbolControlador?accion=listare" class="btn">Volver atrás</a>
                    </div>
                </form>
                      
            </div>
        </div>
    </body>
</html>
