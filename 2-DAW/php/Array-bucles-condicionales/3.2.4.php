<?php
    echo "<html>";
    echo "<head></head>";
    echo "<body>";
   $tablas = [];
for ($i = 0; $i <= 10; $i++) {
    for ($j = 0; $j <= 10; $j++) {
        $tablas[$i][$j] = $i * $j;
    }
}
foreach ($tablas as $numero => $resultados) {
    echo "<table border='1'>";
    echo "<tr><th colspan='2'>Tabla del $numero</th></tr>";
    foreach ($resultados as $multiplicador => $resultado) {
        echo "<tr><td>$numero x $multiplicador</td><td>$resultado</td></tr>";
    }
    echo "</table><br>";
}
    echo "</body>";
    echo "</html>";
?>