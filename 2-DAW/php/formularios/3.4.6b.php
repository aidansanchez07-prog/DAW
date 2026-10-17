<?php
echo "<html>";
echo "<head><title>Ejercicio 6 - Resultado</title></head>";
echo "<body>";
echo "<div style='background-color:lightblue; padding:10px;'>";
echo "Usuario: <b>" . $_POST["usuario"] . "</b>";
echo "</div>";
echo "<h2>Bienvenido, " . $_POST["usuario"] . "</h2>";
echo "<a href='3.4.6.php'>Cerrar sesión</a>";
echo "</body>";
echo "</html>";
?>
