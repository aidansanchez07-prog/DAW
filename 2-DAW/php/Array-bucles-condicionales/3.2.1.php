<?php
    echo "<html>";
    echo "<head></head>";
    echo "<body>";
    $dias = ["domingo", "lunes", "martes", "miércoles", "jueves", "viernes", "sábado"];
    $numeroDia = date("w");
    echo "<p> Hoy es " . $dias[$numeroDia] . ".</p>";
    echo "</body>";
    echo "</html>";
?>
