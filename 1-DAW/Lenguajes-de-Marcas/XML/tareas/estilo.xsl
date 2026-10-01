<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/">
        <html>
            <body style="font-family: Arial;">
                <h2>Mis Tareas Pendientes</h2>
                <table border="1">
                    <tr bgcolor="#9acd32">
                        <th>Tarea</th>
                        <th>Prioridad</th>
                    </tr>
                    <xsl:for-each select="lista_tareas/tarea">
                        <tr>
                            <td><xsl:value-of select="nombre"/></td>
                            <td><xsl:value-of select="prioridad"/></td>
                        </tr>
                    </xsl:for-each>
                </table>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>