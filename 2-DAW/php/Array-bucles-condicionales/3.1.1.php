<?php
    echo "<html>";
    echo "<head></head>";
    echo "<body>";
    echo "Numeros pares del 0 al 100: <br>";
    echo "<table border='1'>";
    for ($i = 0; $i <= 100; $i += 2) {
        echo "<tr><td>  $i </td></tr>";
    }
    echo "</table>";
    echo "Numeros impares del 0 al 100: <br>";
    echo "<ul>";
    for ($i = 1; $i <= 100; $i += 2) {
        echo "<li> $i </li>";
    }
    echo "</ul>";
    echo "</body>";
    echo "</html>";
?>
