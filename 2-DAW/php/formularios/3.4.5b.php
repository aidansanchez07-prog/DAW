<?php
$f = $_POST["fruta"];
echo "<html>";
echo "<head><title>Ejercicio 5 - Resultado</title></head>";
echo "<body>";
echo "<h2>Tu fruta favorita</h2>";
if ($f == "Manzana") {
    echo "<span style='font-size:150px;'>🍎</span>";
} elseif ($f == "Plátano") {
    echo "<span style='font-size:150px;'>🍌</span>";
} else {
    echo "<span style='font-size:150px;'>🍓</span>";
}
echo "<br><br><a href='3.4.5.php'>Volver</a>";
echo "</body>";
echo "</html>";
?>
