
    <?php
        echo"<html>";
        echo "<head></head>";
        echo "<body>";
        echo"<h3>Aidán Sánchez Mañez 2ºDAW</h3>";
        echo "<hr><br>";
        $nombre = "Aidán";
        $apellido = "Sánchez";
        $apellido2 = "Mañez";
        echo"Nombre: $nombre <br>";
        echo"Apellido: $apellido <br>";
        echo"Segundo Apellido: $apellido2 <br>";
        echo $apellido ." " . $apellido2 . "," . " " . $nombre . "<br>";
        echo "<hr><br>";
        $num1 = random_int(1, 10);
        $num2 = random_int(1, 10);
        $num3 = random_int(1, 10);
        echo "num1: $num1 <br>";
        echo "num2: $num2 <br>";
        echo "num3: $num3 <br>";
        echo "Suma: " . ($num1 + $num2 + $num3) . "<br>";
        echo "Multiplicación: " . ($num1 * $num2 * $num3) . "<br>";
        echo "Resta: " . ($num1 - $num2 - $num3) . "<br>";
        echo "</body>";
        echo "</html>";
    ?>