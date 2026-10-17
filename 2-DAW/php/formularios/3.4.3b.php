<?php
$t = $_POST["tamano"];
echo "<html>";
echo "<head><title>Ejercicio 3 - Resultado</title></head>";
echo "<body>";
echo "<h2>Cuadrado con borde</h2>";
echo "<div style='width:" . $t . "px; height:" . $t . "px; background-color:white; border:4px solid black;'></div><br>";
echo "<a href='3.4.3.php'>Volver</a>";
echo "</body>";
echo "</html>";
?>
