<?php
    echo "<html>";
    echo "<head></head>";
    echo "<body>";
    $tirada = random_int(1, 6);
$letras = [
    1 => "uno",
    2 => "dos",
    3 => "tres",
    4 => "cuatro",
    5 => "cinco",
    6 => "seis"
];
    echo "<h2>Tirada de dado</h2>";
    echo "<img src='dado/$tirada.png' alt='Dado con valor $tirada' width='150'>";
    echo "<p>Ha salido el $letras[$tirada].</p>";
    echo "</body>";
    echo "</html>";
?>