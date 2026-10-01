<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

  <xsl:output method="html" encoding="UTF-8" indent="yes"/>

  <xsl:template match="/">
    <html lang="es">
      <head>
        <meta charset="UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        <title>GeoClima - Estado del Tiempo</title>
   
        <link rel="stylesheet" type="text/css" href="clima.css"/>
      </head>
      <body>

        <div class="header">
          <h1>GeoClima &#8209; Estado del Tiempo</h1>
          <p class="fecha">
            Reporte correspondiente al día: <strong>
              <xsl:value-of select="reporte_meteorologico/fecha"/>
            </strong>
          </p>
        </div>

        <div class="grid">
          <xsl:for-each select="reporte_meteorologico/localidad">
            <xsl:call-template name="tarjeta-localidad"/>
          </xsl:for-each>
        </div>

      </body>
    </html>
  </xsl:template>


  <xsl:template name="tarjeta-localidad">
    <div class="card">


      <h2><xsl:value-of select="@nombre"/></h2>
      <p class="provincia"><xsl:value-of select="@provincia"/></p>


      <p class="dato">
        <b>Temperatura:</b>
        <xsl:text> </xsl:text>
        <xsl:value-of select="temperatura"/>&#176;C
<!--lt menor que-->
        <xsl:if test="temperatura &gt; 25">
          <span class="calor">&#9728; Calor</span>
        </xsl:if>
      </p>


      <p class="dato">
        <b>Cielo:</b>
        <xsl:text> </xsl:text>
        <xsl:value-of select="estado_cielo"/>
      </p>

      <p class="dato">
        <b>Viento:</b>
        <xsl:text> </xsl:text>
        <xsl:value-of select="viento"/> km/h, dirección
        <xsl:text> </xsl:text>
        <xsl:value-of select="viento/@direccion"/>
      </p>

      <p class="dato">
        <b>Estado del Mar:</b>
        <xsl:text> </xsl:text>

        <xsl:choose>
          <xsl:when test="estado_mar = 'bravo' or estado_mar = 'peligroso'">
            <span class="aviso-mar">
              &#9888; &#161;<xsl:value-of select="estado_mar"/>! Precaución
            </span>
          </xsl:when>
          <xsl:otherwise>
            <span class="mar-normal">
              <xsl:value-of select="estado_mar"/>
            </span>
          </xsl:otherwise>
        </xsl:choose>
      </p>

    </div>
  </xsl:template>

</xsl:stylesheet>
