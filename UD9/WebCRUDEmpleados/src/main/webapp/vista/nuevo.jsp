<%-- 
    Document   : nuevo.jsp
    Created on : 22 may 2026, 17:14:49
    Author     : aidan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nuevo empleado</title>
    </head>
    <body>
        <div class="container">
            <h3>${empleado.id==0 ?"Nuevo":"Editar"} empleado</h3><!-- comment -->
            <hr><!-- comment -->
            <div>
                <form action="EmpleadoControlador" method="post">
                    <div style="margin-bottom: 10px">
                        <label>Nombre:</label><!-- comment -->
                        <input value="${empleado.nombre}" name="nombre" type="text" maxlength="45" class="form.control" required="true">
                    </div>
                    <div style="margin-bottom: 10px">
                        <label>Apellidos:</label><!-- comment -->
                        <input value="${empleado.apellidos}" name="apellidos" type="text" maxlength="45" class="form.control" required="true">
                    </div>
                    <div style="margin-bottom: 10px">
                        <label>Fecha ingreso:</label><!-- comment -->
                        <input value="${empleado.fechaIngreso}" name="fechaIngreso" type="date" maxlength="45" class="form.control" required="true">
                    </div>
                    <div style="margin-bottom: 10px">
                        <label>Sueldo:</label><!-- comment -->
                        <input value="${empleado.sueldo}" name="sueldo" type="number" class="form.control" required="true">
                    </div>
                    <div style="margin-bottom: 10px">
                        <label>Nombre departamento:</label><!-- comment -->
                        <input value="${empleado.nombreDepto}" name="nombreDepto" type="text" maxlength="45" class="form.control" required="">
                    </div>
                    <div><!-- comment -->
                        <%--
                            Accion de tipo oculta donde vamos a cargar el valor del id -- > y así este id lo recupero al guardar.
                        --%>
                        <input type="hidden" name="id" value="${empleado.id}">
                        <input  type="hidden" name="accion" value="guardar">
                        <button class="btn">Guardar</button>
                        <a href="EmpleadoControlador?accion=listar" class="btn">Volver atrás</a>
                    </div>
                </form>
                      
            </div>
        </div>
    </body>
</html>
