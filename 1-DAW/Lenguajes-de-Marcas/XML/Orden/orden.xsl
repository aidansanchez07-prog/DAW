<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">

        <html>
            <head>
                <link rel="stylesheet" href="orden.css" />
            </head>
            <body>

                <xsl:for-each select="taller/orden">
                    <div>
                        <xsl:attribute name="class">
                            <xsl:choose>
                                <xsl:when test="@urgente = 'true'">orden urgente</xsl:when>
                                <xsl:otherwise>orden</xsl:otherwise>
                            </xsl:choose>
                        </xsl:attribute>


                        <div class="titulo"> Orden: <xsl:value-of select="@numero" />
                            <xsl:if
                                test="@urgente = 'true'"> ¡URGENTE!</xsl:if>
                        </div>


                        <div class="info"> Vehículo:<span>
                                <xsl:value-of select="marca" />
                                <xsl:value-of select="modelo" /> (<xsl:value-of
                                    select="anio" />) </span>
                        </div>


                        <div class="info"> Fecha Entrada:<span>
                                <xsl:value-of select="fecha" />
                            </span>
                        </div>


                        <table>
                            <tr>
                                <th>Descripción del Servicio</th>
                                <th>Coste</th>
                            </tr>
                            <xsl:for-each select="servicios/item">
                                <tr>
                                    <td>
                                        <xsl:value-of select="descripcion" />
                                    </td>
                                    <td><xsl:value-of select="coste" />€</td>
                                </tr>
                            </xsl:for-each>
                        </table>


                        <div>
                            <span class="estado-label">Estado: </span>
                            <span>
                                <xsl:attribute name="class">
                                    <xsl:value-of select="estado" />
                                </xsl:attribute>
                                <xsl:value-of select="estado" />
                            </span>
                        </div>

                    </div>
                </xsl:for-each>

            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>