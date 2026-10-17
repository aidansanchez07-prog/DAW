<?php
echo"<html>";
echo "<head></head>";
echo "<body>";
date_default_timezone_set('Europe/Madrid');
 
function fecha(string $formato): string
{
    return date($formato);
}
echo fecha('d/m/y H:i:s') . "<br>";
echo "Son las " . fecha('H:i:s') . " y hoy es " . fecha('d-m-Y') . "<br>";
echo "</body>";
echo "</html>";

?>