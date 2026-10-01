<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <head>
                <style>
                    .descuento { color: red; font-weight: bold; }
                    .normal { color: black; }
                </style>
            </head>
            <body>
                <h2>Catálogo de Juegos Especial</h2>
                <table border="1" cellpadding="10">
                    <tr bgcolor="#eeeeee">
                        <th>Categoría</th>
                        <th>Título</th>
                        <th>Precio</th>
                        <th>Enlace</th>
                    </tr>
                    <xsl:for-each select="catalogo/juego">
                        <tr>
                            <td>
                                <xsl:value-of select="@categoria" />
                            </td>
                            <td>
                                <xsl:if test="oferta = 'si'">
                                    <span class="descuento">[OFERTA] </span>
                                </xsl:if>
                                <xsl:value-of select="titulo" />
                            </td>
                            <td><xsl:value-of select="precio" />€</td>
                            <td>
                                <a target="_blank">
                                    <xsl:attribute name="href">
                                        <xsl:value-of select="url" />
                                    </xsl:attribute>
                                    Ver tienda </a>
                            </td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>