<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head>
                <link rel="stylesheet" href="biblioteca.css"/> 
                
            </head>
            <body>
                
                <h1>Biblioteca</h1>
                
                <h2>Libros</h2>
                <table>
                    <tr>
                        <th>ID</th>
                        <th>Titulo</th>
                        <th>Autor</th>
                        <th>Año</th>
                        <th>Editorial</th>
                        <th>Categoria</th>
                    </tr>
                    <xsl:for-each select="biblioteca/libros/libro">
                        <tr>
                            <td><xsl:value-of select="@id" /></td>
                            <td><xsl:value-of select="titulo" /></td>
                            <td>
                                <xsl:for-each select="autores/autor">
                                    <xsl:value-of select="." />
                                    <xsl:if test="position() != last()">, </xsl:if>
                                </xsl:for-each>
                            </td>
                            <td><xsl:value-of select="anio" /></td>
                            <td><xsl:value-of select="editorial" /></td>
                            <td><xsl:value-of select="categoria" /></td>
                        </tr>
                    </xsl:for-each>
                </table>
                
                <h2>Usuarios</h2>
                <table>
                    <tr>
                        <th>ID</th>
                        <th>Nombre</th>
                        <th>Apellidos</th>
                        <th>Email</th>
                        <th>Tipo</th>
                    </tr>
                    <xsl:for-each select="biblioteca/usuarios/usuario">
                        <tr>
                            <td><xsl:value-of select="@id" /></td>
                            <td><xsl:value-of select="nombre" /></td>
                            <td><xsl:value-of select="apellido" /></td>
                            <td><xsl:value-of select="email" /></td>
                            <td><xsl:value-of select="tipo" /></td>
                        </tr>
                    </xsl:for-each>
                </table>
                
                <h2>Préstamos</h2>
                <table>
                    <tr>
                        <th>ID</th>
                        <th>Usuario</th>
                        <th>Fecha inicio</th>
                        <th>Fecha devolución</th>
                        <th>Libros</th>
                    </tr>
                    <xsl:for-each select="biblioteca/prestamos/prestamo">
                        <tr>
                            <td><xsl:value-of select="@id" /></td>
                            <td><xsl:value-of select="@usuario_ref" /></td>
                            <td><xsl:value-of select="fecha_inicio" /></td>
                            <td><xsl:value-of select="fecha_devolucion" /></td>
                            <td><xsl:value-of select="@libro_ref" /></td>
                        </tr>
                    </xsl:for-each>
                </table>
                
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>